package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afnw {
    private static final Map a = aqjn.m(new armo("smileys_and_emotion", new afnv(R.string.emoji_standard_category_smileys_and_emotion, R.drawable.ic_emoji_standard_category_smileys_and_emotion)), new armo("people", new afnv(R.string.emoji_standard_category_people, R.drawable.ic_emoji_standard_category_people)), new armo("animals_and_nature", new afnv(R.string.emoji_standard_category_animals_and_nature, R.drawable.ic_emoji_standard_category_animals_and_nature)), new armo("food_and_drink", new afnv(R.string.emoji_standard_category_food_and_drink, R.drawable.ic_emoji_standard_category_food_and_drink)), new armo("travel_and_places", new afnv(R.string.emoji_standard_category_travel_and_places, R.drawable.ic_emoji_standard_category_travel_and_places)), new armo("activities", new afnv(R.string.emoji_standard_category_activities, R.drawable.ic_emoji_standard_category_activities)), new armo("objects", new afnv(R.string.emoji_standard_category_objects, R.drawable.ic_emoji_standard_category_objects)), new armo("symbols", new afnv(R.string.emoji_standard_category_symbols, R.drawable.ic_emoji_standard_category_symbols)), new armo("flags", new afnv(R.string.emoji_standard_category_flags, R.drawable.ic_emoji_standard_category_flags)));

    public static final afnv a(aflx aflxVar) {
        aflxVar.getClass();
        Map map = a;
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = aflxVar.a.toLowerCase(locale);
        lowerCase.getClass();
        afnv afnvVar = (afnv) map.get(arsd.Z(arsd.Z(lowerCase, " ", "_"), "&", "and"));
        if (afnvVar != null) {
            return afnvVar;
        }
        throw new IllegalStateException("No resource defined for " + aflxVar.a + "!");
    }
}
