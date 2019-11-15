package tj.rs.photogallery;

import android.content.Context;
import android.preference.PreferenceManager;

/**
 * Created by Rustam Safarov (RS) on 15.11.2019.
 * (c) 2019 RS DevTeam. All rights reserved!
 */
public class QueryPreferences {
    private static final String PREF_SEARCH_QUERY = "searchQuery";

    public static String getStoredQuery(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getString(PREF_SEARCH_QUERY, null);
    }

    public static void setStoredQuery(Context context, String query) {
        PreferenceManager.getDefaultSharedPreferences(context)
                .edit()
                .putString(PREF_SEARCH_QUERY, query)
                .apply();
    }
}
