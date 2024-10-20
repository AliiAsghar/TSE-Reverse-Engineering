package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mno implements mnk {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public mno(jxb jxbVar, jwy jwyVar, int i) {
        this.c = i;
        this.b = jxbVar;
        this.a = jwyVar;
    }

    @Override // defpackage.mnk
    public final Instant a() {
        if (this.c != 0) {
            Instant f = ((jwy) this.a).d.f();
            f.getClass();
            return f;
        }
        Instant ofEpochMilli = Instant.ofEpochMilli(((ajsm) this.b).b);
        ofEpochMilli.getClass();
        return ofEpochMilli;
    }

    @Override // defpackage.mnk
    public final Integer b() {
        if (this.c != 0) {
            Object obj = this.b;
            if (obj == null) {
                return null;
            }
            return Integer.valueOf(((jxb) obj).a);
        }
        vst vstVar = (vst) this.a;
        if ((vstVar.b & 1) == 0) {
            return null;
        }
        return Integer.valueOf(vstVar.c);
    }

    public mno(vst vstVar, ajsm ajsmVar, int i) {
        this.c = i;
        this.a = vstVar;
        this.b = ajsmVar;
    }
}
