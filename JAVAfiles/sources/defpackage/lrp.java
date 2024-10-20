package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lrp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/privacy/identitydetails/IdentityDetailsFragmentPeer");
    public static final List b;
    public final cg c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final lrn i;
    public final akgs j;

    static {
        alog C = alog.C(Integer.valueOf(R.id.key_part_1), Integer.valueOf(R.id.key_part_2), Integer.valueOf(R.id.key_part_3), Integer.valueOf(R.id.key_part_4), Integer.valueOf(R.id.key_part_5), Integer.valueOf(R.id.key_part_6), Integer.valueOf(R.id.key_part_7), Integer.valueOf(R.id.key_part_8), Integer.valueOf(R.id.key_part_9), Integer.valueOf(R.id.key_part_10), Integer.valueOf(R.id.key_part_11), Integer.valueOf(R.id.key_part_12), new Integer[0]);
        C.getClass();
        b = C;
    }

    public lrp(cg cgVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, lrn lrnVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        this.c = cgVar;
        this.d = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.g = armfVar4;
        this.h = armfVar5;
        this.i = lrnVar;
        this.j = new isj(this, 5);
    }

    public final View a() {
        View findViewById = this.c.L().findViewById(R.id.grid_view);
        findViewById.getClass();
        return findViewById;
    }

    public final boolean b() {
        if ((this.i.b & 4) != 0) {
            return true;
        }
        return false;
    }
}
