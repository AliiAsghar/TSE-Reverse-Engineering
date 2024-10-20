package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iiz extends no {
    public alog c;
    private final Map d;
    private final aksr e;
    private final alor f;

    public iiz(Map map, aksr aksrVar, alor alorVar) {
        this.d = map;
        this.e = aksrVar;
        this.f = alorVar;
    }

    @Override // defpackage.no
    public final int b() {
        alog alogVar = this.c;
        if (alogVar == null) {
            return 0;
        }
        return alogVar.size();
    }

    @Override // defpackage.no
    public final int c(int i) {
        boolean z;
        alog alogVar = this.c;
        alogVar.getClass();
        if (i < alogVar.size()) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        return ((iip) this.c.get(i)).a().g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.no
    public final oo e(ViewGroup viewGroup, int i) {
        iit iitVar;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                iitVar = iit.REMINDER_BADGE;
                            } else {
                                throw new IllegalArgumentException("No BadgeViewType corresponding to value " + i);
                            }
                        } else {
                            iitVar = iit.SCHEDULED_SEND_BADGE;
                        }
                    } else {
                        iitVar = iit.CALENDAR_BADGE;
                    }
                } else {
                    iitVar = iit.STAR_BADGE;
                }
            } else {
                iitVar = iit.CUSTOM_REACTION_BADGE;
            }
        } else {
            iitVar = iit.REACTION_BADGE;
        }
        d.s(this.d.containsKey(iitVar));
        iir iirVar = (iir) this.d.get(iitVar);
        iirVar.getClass();
        oo a = iirVar.a();
        ijd ijdVar = (ijd) a;
        iit a2 = ijdVar.a();
        iit a3 = ijdVar.a();
        int i3 = 0;
        if (a2 == iitVar) {
            View view = a.a;
            ViewParent parent = view.getParent();
            if (parent != null) {
                view.setOnTouchListener(new iiy(parent, i3));
            }
            zhi zhiVar = (zhi) this.f.get(iitVar);
            if (zhiVar != null) {
                a.a.setOnClickListener(new akwb(this.e, "BadgesRecyclerView#onBadgeClick", new iix(zhiVar, iitVar, i3, null), i2));
            }
            return a;
        }
        throw new alia(albo.F("Expected to create a badge of type %s, but was %s.", iitVar, a3));
    }

    @Override // defpackage.no
    public final void g(oo ooVar, int i) {
        boolean z;
        alog alogVar = this.c;
        alogVar.getClass();
        if (i < alogVar.size()) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        ((iip) this.c.get(i)).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.no
    public final void k(oo ooVar) {
        ((ijd) ooVar).b();
    }
}
