package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzk implements kze {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public kzk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.kze
    public final void a(kzw kzwVar, kzd kzdVar, kzh kzhVar) {
        boolean z = true;
        if (this.b != 0) {
            kzhVar.getClass();
            if (!((oju) ((kzj) this.a).c.b()).a()) {
                return;
            }
            if (kzdVar.r == vvh.j) {
                Integer num = kzhVar.b;
                if (num != null) {
                    if (num.intValue() <= 0) {
                        kzj kzjVar = (kzj) this.a;
                        qjh.c(kzjVar.a, arpj.a, arwf.a, new jsu(kzjVar, (arpe) null, 20));
                    }
                    Integer num2 = kzhVar.b;
                    num2.getClass();
                    if (num2.intValue() >= 2) {
                        z = false;
                    }
                    kzwVar.Q = Boolean.valueOf(z);
                    return;
                }
                kzwVar.Q = false;
                return;
            }
            kzwVar.Q = null;
            return;
        }
        kzhVar.getClass();
        if (!((ohf) ((kzm) this.a).b.b()).a()) {
            kzwVar.R = null;
            return;
        }
        ngh nghVar = kzhVar.c;
        if (nghVar != null && nghVar != ngh.a && ((kzdVar.C == 3 && kzdVar.w > 1) || kzdVar.r == vvh.j)) {
            kzwVar.R = ((kzm) this.a).a.getString(R.string.conversation_not_available);
        } else {
            kzwVar.R = null;
        }
    }
}
