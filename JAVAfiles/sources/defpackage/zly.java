package defpackage;

import android.view.ActionMode;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.SimMessagesActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zly {
    public static final alwo a = alwo.o("Bugle");
    public static final alhr b = uuh.v(190754619);
    public final zlu c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final int j;
    public final ActionMode.Callback k = new zlx(this, 0);
    public akhu l;
    public int m;
    public a n;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class a implements akbp<Integer, Boolean> {
        public a() {
        }

        private final void d() {
            zly.this.b(-1);
            zly.this.a();
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            ((alwl) ((alwl) ((alwl) zly.a.i()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/SimMessagesV2FragmentPeer$DeleteMessageCallback", "onFailure", 466, "SimMessagesV2FragmentPeer.java")).t("SimMessagesActivity: delete failure %d", (Integer) obj);
            d();
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void b(Object obj) {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            if (((Boolean) obj2).booleanValue()) {
                ((alwl) zly.a.m().h("com/google/android/apps/messaging/ui/appsettings/SimMessagesV2FragmentPeer$DeleteMessageCallback", "onSuccess", 455, "SimMessagesV2FragmentPeer.java")).t("SimMessagesActivity: deleted %d", num);
                d();
            } else {
                ((abbu) zly.this.h.b()).k(R.string.sim_message_deletion_failed);
                ((alwl) ((alwl) zly.a.i()).h("com/google/android/apps/messaging/ui/appsettings/SimMessagesV2FragmentPeer$DeleteMessageCallback", "onSuccess", 459, "SimMessagesV2FragmentPeer.java")).t("SimMessagesActivity: could not delete %d", num);
            }
            d();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class b implements akvv {
        public final View a;

        public b(View view) {
            this.a = view;
        }
    }

    public zly(zlu zluVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, String str) {
        this.c = zluVar;
        this.d = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.g = armfVar4;
        this.h = armfVar5;
        this.i = armfVar6;
        this.j = Integer.parseInt(str);
    }

    public final void a() {
        zll.a(((SimMessagesActivity) this.c.fe()).E().a);
    }

    public final void b(int i) {
        this.m = i;
        this.l.p();
    }

    public final boolean c() {
        if (this.m >= 0) {
            return true;
        }
        return false;
    }
}
