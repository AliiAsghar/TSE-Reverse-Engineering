package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.view.MenuItem;
import com.google.android.gms.wearable.PutDataRequest;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaoq {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/ui/debug/wearable/WearableDebugMenuProvider");
    public static final Uri b = PutDataRequest.a("/bugle/phone_config/").a;
    public static final Uri c = PutDataRequest.a("/bugle/rpc/proto/v1/conversations_list/").a;
    public static final Uri d = PutDataRequest.a("/bugle/conversations/*").a;
    public final wul e;
    public final yxa f;
    public final armf g;
    public final aksr h;
    public final abay i;
    public final arwe j;
    public final abrc k;
    public final aagg l;

    public aaoq(aajv aajvVar, abrc abrcVar, wul wulVar, aagg aaggVar, yxa yxaVar, armf armfVar, aksr aksrVar, abay abayVar, arwe arweVar) {
        aajvVar.getClass();
        abrcVar.getClass();
        aaggVar.getClass();
        yxaVar.getClass();
        armfVar.getClass();
        aksrVar.getClass();
        abayVar.getClass();
        arweVar.getClass();
        this.k = abrcVar;
        this.e = wulVar;
        this.l = aaggVar;
        this.f = yxaVar;
        this.g = armfVar;
        this.h = aksrVar;
        this.i = abayVar;
        this.j = arweVar;
    }

    public static final Object c(acir acirVar, arpe arpeVar) {
        return arro.F(agkx.f(acirVar), arpeVar);
    }

    public final void a(MenuItem menuItem, final Activity activity, final arqr arqrVar) {
        menuItem.setOnMenuItemClickListener(new aksh(this.h, "WearDebugMenuClick", new MenuItem.OnMenuItemClickListener() { // from class: aaoo
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem2) {
                menuItem2.getClass();
                arqrVar.a(aajv.l(activity, Optional.empty(), Optional.empty()));
                return false;
            }
        }));
    }

    public final void b(Activity activity) {
        String str;
        boolean b2 = this.f.b();
        boolean c2 = this.l.c();
        abee abeeVar = (abee) this.e.l();
        if ((abeeVar.b & 1) != 0) {
            long epochSecond = Instant.now().getEpochSecond();
            apct apctVar = abeeVar.c;
            if (apctVar == null) {
                apctVar = apct.a;
            }
            long p = arsd.p(epochSecond - apctVar.b, aruv.d);
            str = arut.f(p) + "d" + arut.b(p) + "h" + arut.c(p) + "m" + arut.e(p) + "s ago";
        } else {
            str = "N/A";
        }
        xzw.c(new aanh(activity, arsd.s("\n      |Wear companion app installed: " + b2 + "\n      |Watch recently online: " + c2 + "\n      |Last online: " + str + "\n      |\n      |Wear sync enabled: " + c2 + "\n    "), 2));
    }
}
