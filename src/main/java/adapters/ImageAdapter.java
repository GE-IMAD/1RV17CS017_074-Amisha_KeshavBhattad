package adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import utils.TouchImageView;

public class ImageAdapter extends PagerAdapter {
    private final Context mContext;
    private final ArrayList<String> mGalImages;


    public ImageAdapter(Context context, ArrayList<String> images) {
        mGalImages = images;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        if (mGalImages == null)
            return 0;
        return mGalImages.size();
    }


    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        TouchImageView imageView = new TouchImageView(mContext);

        Picasso.with(mContext).load(mGalImages.get(position)).into(imageView);

        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}