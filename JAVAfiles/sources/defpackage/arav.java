package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arav {
    private ArrayList b = new ArrayList();
    public volatile aqsd a = aqsd.IDLE;

    public final void a(aqsd aqsdVar) {
        aqsdVar.getClass();
        if (this.a != aqsdVar && this.a != aqsd.SHUTDOWN) {
            this.a = aqsdVar;
            if (!this.b.isEmpty()) {
                ArrayList arrayList = this.b;
                this.b = new ArrayList();
                if (arrayList.size() > 0) {
                    throw null;
                }
            }
        }
    }
}
