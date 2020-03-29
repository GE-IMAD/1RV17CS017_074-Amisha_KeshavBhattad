package utils;

import android.content.Context;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class WeatherUtils {

    public static int fetchDrawableFileResource(Context context, String iconUrl, int code)
            throws JSONException, IOException {
        String imageDrawable = "wi_";
        String time = iconUrl.substring(iconUrl.lastIndexOf("/") + 1);
        imageDrawable += time.contains("d") ? "day" : "night";
        String suffix = getSuffix(context, code);
        imageDrawable += "_" + suffix;

        return context.getResources().getIdentifier(imageDrawable, "drawable", "io.github.project_travel_mate");
    }

    private static String getSuffix(Context context, int code) throws JSONException, IOException {
        String json;
        String cond = "";
        try {
            InputStream is = context.getAssets().open("icons.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");

            JSONObject jsonObject = new JSONObject(json);
            if (jsonObject.has(String.valueOf(code))) {
                JSONObject object = jsonObject.getJSONObject(String.valueOf(code));
                cond = object.getString("icon");
            }

        } catch (JSONException ex) {
            throw new JSONException(ex.getMessage());
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
        return cond;
    }

    public static String getDayOfWeek(int index, String pattern) {

        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern, Locale.getDefault());
        Calendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DATE, index);
        return dateFormat.format(calendar.getTime());
    }

}
