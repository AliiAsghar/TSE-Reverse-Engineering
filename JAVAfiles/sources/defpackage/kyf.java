package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyf extends eor {
    public static final xze a = xze.g("BugleSuperSort", "ConversationListViewModelImpl");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/home/list/ConversationListViewModelImpl");
    public final anen d;
    public final int e;
    public kxx f;
    public List g;
    public final armf h;
    public Parcelable i;
    public env j;
    public Snackbar k;
    public final mka p;
    public final mlt q;
    public lga r;
    public final Object c = new Object();
    public final Boolean l = true;
    public Boolean m = true;
    public Boolean n = false;
    public Boolean o = false;

    public kyf(mlt mltVar, Context context, anen anenVar, armf armfVar, mka mkaVar) {
        int i;
        this.q = mltVar;
        this.d = anenVar;
        this.p = mkaVar;
        try {
            i = (context.getResources().getDisplayMetrics().heightPixels / context.getResources().getDimensionPixelSize(R.dimen.conversation_list_item_view_min_height_m2)) + 1;
        } catch (Resources.NotFoundException unused) {
            i = 20;
        }
        this.e = i;
        this.h = armfVar;
        xyo c = a.c();
        c.H("ConversationListViewModelImpl created");
        c.x("instance", hashCode());
        c.q();
    }

    public final void a() {
        kxx kxxVar = this.f;
        if (kxxVar != null) {
            mka mkaVar = this.p;
            kxxVar.m.i = (kzh) mkaVar.a;
            kxxVar.k();
        }
    }

    public final boolean b() {
        if (this.i == null) {
            return true;
        }
        return false;
    }
}
