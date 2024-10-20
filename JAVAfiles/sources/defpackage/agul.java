package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agul {
    private static final alvi a = alvi.m("com/google/android/libraries/inputmethod/emoji/data/EmojiDataUtils");

    public static int a() {
        if (agxg.b(agxg.instance.h)) {
            return R.array.emoji_list_raw_resources_with_gender_inclusive_for_supplier;
        }
        return R.array.emoji_list_raw_resources_for_supplier;
    }

    public static List b(Context context, int i) {
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(i);
        ArrayList arrayList = new ArrayList(obtainTypedArray.length());
        for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
            int resourceId = obtainTypedArray.getResourceId(i2, 0);
            if (resourceId != 0) {
                arrayList.add(Integer.valueOf(resourceId));
            } else {
                ((alvg) ((alvg) a.h()).h("com/google/android/libraries/inputmethod/emoji/data/EmojiDataUtils", "getResourceIds", 67, "EmojiDataUtils.java")).B("Invalid resource ID was specified in %s (index=%d)", ahbm.a(context, i), i2);
            }
        }
        obtainTypedArray.recycle();
        return arrayList;
    }
}
