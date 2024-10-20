package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfo extends arpw implements arqr {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfo(arpe arpeVar, int i) {
        super(1, arpeVar);
        this.a = i;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        new jfo((arpe) obj, 4, (int[]) null);
                        return a.I(arnb.a);
                    }
                    return new jfo((arpe) obj, 3, (short[]) null).b(arnb.a);
                }
                new jfo((arpe) obj, 2, (char[]) null);
                return a.I(arnb.a);
            }
            return new jfo((arpe) obj, 1, (byte[]) null).b(arnb.a);
        }
        return new jfo((arpe) obj, 0).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return a.I(obj);
                    }
                    aqil.P(obj);
                    ura uraVar = new ura(urd.a);
                    uraVar.w("WorkQueueWorkManagerTableJanitorTask#findQueuesWithNullWorkManagerUuid");
                    uraVar.c((uqv) urd.c.a);
                    uraVar.d(new unt(11));
                    alog t = uraVar.b().t();
                    t.getClass();
                    ArrayList arrayList = new ArrayList(aqjn.J(t, 10));
                    alur it = t.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((uqs) it.next()).k());
                    }
                    return arrayList;
                }
                return a.I(obj);
            }
            aqil.P(obj);
            return true;
        }
        aqil.P(obj);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfo(arpe arpeVar, int i, byte[] bArr) {
        super(1, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfo(arpe arpeVar, int i, char[] cArr) {
        super(1, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfo(arpe arpeVar, int i, int[] iArr) {
        super(1, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfo(arpe arpeVar, int i, short[] sArr) {
        super(1, arpeVar);
        this.a = i;
    }
}
