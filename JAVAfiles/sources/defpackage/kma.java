package defpackage;

import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kma {
    public static final xze a = xze.g("Bugle", "DataDonationFragmentPeer");
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final armf l;
    final akgh m = new kly(this);
    public final akbp n = new klz(this);
    public RecyclerView o;
    public kme p;
    public CircularProgressIndicator q;
    public FrameLayout r;
    public Button s;

    public kma(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11) {
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        this.g = armfVar6;
        this.h = armfVar7;
        this.i = armfVar8;
        this.j = armfVar9;
        this.k = armfVar10;
        this.l = armfVar11;
    }

    public final void a() {
        CircularProgressIndicator circularProgressIndicator = this.q;
        if (circularProgressIndicator.getVisibility() != 0) {
            circularProgressIndicator.removeCallbacks(circularProgressIndicator.h);
        } else {
            circularProgressIndicator.removeCallbacks(circularProgressIndicator.i);
            long uptimeMillis = SystemClock.uptimeMillis() - circularProgressIndicator.e;
            long j = circularProgressIndicator.d;
            if (uptimeMillis >= j) {
                circularProgressIndicator.i.run();
            } else {
                circularProgressIndicator.postDelayed(circularProgressIndicator.i, j - uptimeMillis);
            }
        }
        this.r.setVisibility(8);
    }

    public final void b() {
        CircularProgressIndicator circularProgressIndicator = this.q;
        if (circularProgressIndicator.c > 0) {
            circularProgressIndicator.removeCallbacks(circularProgressIndicator.h);
            circularProgressIndicator.postDelayed(circularProgressIndicator.h, circularProgressIndicator.c);
        } else {
            circularProgressIndicator.h.run();
        }
        this.r.setVisibility(0);
    }
}
