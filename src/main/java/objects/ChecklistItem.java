package objects;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import io.roompersistance.BooleanConverter;

@Entity(tableName = "events_new")
@TypeConverters({io.roompersistance.BooleanConverter.class})
public class ChecklistItem {

    //so that primary key is generated automatically
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int mId = 0;

    @ColumnInfo(name = "name")
    private final String mName;

    @ColumnInfo(name = "isDone")
    private final boolean mIsDone;

    @ColumnInfo(name = "position")
    private final int mPosition;

    public ChecklistItem(String name, boolean isDone, int position) {
        this.mName = name;
        this.mIsDone = isDone;
        this.mPosition = position;
    }

    public int getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public boolean getIsDone() {
        return mIsDone;
    }

    public int getPosition() {
        return mPosition;
    }

    public void setId(int id) {
        this.mId = id;
    }

    @Override
    public String toString() {
        return "ChecklistItem(id= " + mId + ", name= " + mName + ", isDone= " + mIsDone +
                ", pos= " + mPosition + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ChecklistItem) {
            // the position of the item is ignored intentionally, as it does not affect item content
            return (((ChecklistItem) obj).getId() == mId)
                    && (((ChecklistItem) obj).getName().equals(mName))
                    && (((ChecklistItem) obj).getIsDone() == mIsDone);
        } else {
            return false;
        }
    }
}