package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwb extends arpw implements arqv {
    int a;
    int b;
    final /* synthetic */ long c;
    final /* synthetic */ UUID d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwb(lvu lvuVar, long j, UUID uuid, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.e = lvuVar;
        this.c = j;
        this.d = uuid;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((lwb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((lwb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:3|(1:(8:6|7|8|9|10|11|12|13)(4:21|22|23|24))(4:34|35|36|(1:39)(1:38))|25|26|27|(2:29|30)|10|11|12|13) */
    /* JADX WARN: Can't wrap try/catch for region: R(10:43|(1:(8:46|47|48|49|50|51|52|53)(4:60|61|62|63))(4:73|74|75|(1:78)(1:77))|64|65|66|(2:68|69)|50|51|52|53) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012b, code lost:
    
        r2 = r9;
     */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        if (this.f != 0) {
            return new lwb((lvu) this.e, this.c, this.d, arpeVar, 1);
        }
        return new lwb((lwh) this.e, this.c, this.d, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwb(lwh lwhVar, long j, UUID uuid, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.e = lwhVar;
        this.c = j;
        this.d = uuid;
    }
}
