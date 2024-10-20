package defpackage;

import defpackage.cvc;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class we implements cue {
    private final wi a;
    private boolean b;

    /* compiled from: PG */
    /* renamed from: we$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ List a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list) {
            super(1);
            this.a = list;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            List list = this.a;
            cvc.a aVar = (cvc.a) obj;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                aVar.e((cvc) list.get(i), 0, 0, brg.a);
            }
            return arnb.a;
        }
    }

    public we(wi wiVar) {
        this.a = wiVar;
    }

    @Override // defpackage.cue
    public final int a(ctd ctdVar, List list, int i) {
        int i2 = 0;
        if (!list.isEmpty()) {
            i2 = ((ctc) list.get(0)).a(i);
            int z = aqjn.z(list);
            if (z > 0) {
                int i3 = 1;
                while (true) {
                    int a = ((ctc) list.get(i3)).a(i);
                    if (a > i2) {
                        i2 = a;
                    }
                    if (i3 == z) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return i2;
    }

    @Override // defpackage.cue
    public final int b(ctd ctdVar, List list, int i) {
        int i2 = 0;
        if (!list.isEmpty()) {
            i2 = ((ctc) list.get(0)).b(i);
            int z = aqjn.z(list);
            if (z > 0) {
                int i3 = 1;
                while (true) {
                    int b = ((ctc) list.get(i3)).b(i);
                    if (b > i2) {
                        i2 = b;
                    }
                    if (i3 == z) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return i2;
    }

    @Override // defpackage.cue
    public final int c(ctd ctdVar, List list, int i) {
        int i2 = 0;
        if (!list.isEmpty()) {
            i2 = ((ctc) list.get(0)).c(i);
            int z = aqjn.z(list);
            if (z > 0) {
                int i3 = 1;
                while (true) {
                    int c = ((ctc) list.get(i3)).c(i);
                    if (c > i2) {
                        i2 = c;
                    }
                    if (i3 == z) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return i2;
    }

    @Override // defpackage.cue
    public final int d(ctd ctdVar, List list, int i) {
        int i2 = 0;
        if (!list.isEmpty()) {
            i2 = ((ctc) list.get(0)).d(i);
            int z = aqjn.z(list);
            if (z > 0) {
                int i3 = 1;
                while (true) {
                    int d = ((ctc) list.get(i3)).d(i);
                    if (d > i2) {
                        i2 = d;
                    }
                    if (i3 == z) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return i2;
    }

    @Override // defpackage.cue
    public final cuf e(cuh cuhVar, List list, long j) {
        cuf et;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            cvc e = ((cuc) list.get(i3)).e(j);
            i2 = Math.max(i2, e.a);
            i = Math.max(i, e.b);
            arrayList.add(e);
        }
        if (cuhVar.ev()) {
            this.b = true;
            this.a.a.h(new dri((i2 << 32) | (4294967295L & i)));
        } else if (!this.b) {
            this.a.a.h(new dri((i2 << 32) | (4294967295L & i)));
        }
        et = cuhVar.et(i2, i, arnw.a, new AnonymousClass1(arrayList));
        return et;
    }
}
