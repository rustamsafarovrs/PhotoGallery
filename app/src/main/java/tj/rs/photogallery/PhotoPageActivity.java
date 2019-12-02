package tj.rs.photogallery;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import androidx.fragment.app.Fragment;

/**
 * Created by Rustam Safarov (RS) on 29.11.2019.
 * (c) 2019 RS DevTeam. All rights reserved!
 */
public class PhotoPageActivity extends SingleFragmentActivity {
    public static Intent newIntent(Context context, Uri photoPageUri) {
        Intent i = new Intent(context, PhotoPageActivity.class);
        i.setData(photoPageUri);
        return i;
    }

    @Override
    protected Fragment createFragment() {
        return PhotoPageFragment.newInstance(getIntent().getData());
    }
}
