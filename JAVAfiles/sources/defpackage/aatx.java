package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatx implements aaqh {
    public final vl a;
    private final aatw[] b;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public interface a {
        yyb b();
    }

    public aatx(Context context, aatw aatwVar) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        vl vlVar = new vl();
        this.a = vlVar;
        ((a) akec.w(context, a.class)).b();
        String[] stringArray = context.getResources().getStringArray(R.array.gif_category_names_tenor);
        String[] stringArray2 = context.getResources().getStringArray(R.array.gif_category_queries_tenor);
        int[] intArray = context.getResources().getIntArray(R.array.gif_category_background_colors);
        int[] intArray2 = context.getResources().getIntArray(R.array.gif_category_text_icon_colors);
        int length = stringArray.length;
        int length2 = stringArray2.length;
        if (length == length2) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        if (length == intArray.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        albo.T(z2);
        if (length == intArray2.length) {
            z3 = true;
        } else {
            z3 = false;
        }
        albo.T(z3);
        if (aatwVar != null) {
            i = 1;
        } else {
            i = 0;
        }
        aatw[] aatwVarArr = new aatw[length2 + i];
        this.b = aatwVarArr;
        if (aatwVar != null) {
            aatwVarArr[0] = aatwVar;
            vlVar.put(albo.ag(aatwVar.b), 0);
        }
        for (int i2 = 0; i2 < stringArray2.length; i2++) {
            aatw[] aatwVarArr2 = this.b;
            int i3 = i2 + i;
            String str = stringArray[i2];
            String str2 = stringArray2[i2];
            int i4 = intArray[i2];
            int i5 = intArray2[i2];
            aatwVarArr2[i3] = new aatw(str, str2);
            albo.T(!this.a.containsKey(stringArray2[i2]));
            this.a.put(stringArray2[i2], Integer.valueOf(i3));
        }
    }

    @Override // defpackage.aaqh
    public final int a() {
        return this.b.length;
    }

    public final aatw b(int i) {
        return this.b[i];
    }
}
