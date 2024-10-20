package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class icy extends arpw implements arqr {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icy(anki ankiVar, aqfn aqfnVar, anjp anjpVar, aqgo aqgoVar, Instant instant, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.g = i;
        this.c = ankiVar;
        this.e = aqfnVar;
        this.b = anjpVar;
        this.f = aqgoVar;
        this.d = instant;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v10, types: [anky, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v12, types: [anky, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [anky, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        switch (this.g) {
            case 0:
                arpe arpeVar = (arpe) obj;
                Object obj2 = this.b;
                Object obj3 = this.c;
                Object obj4 = this.d;
                UUID uuid = (UUID) obj4;
                return new icy((idb) obj2, (abmy) obj3, uuid, (arlq) this.e, (Duration) this.f, arpeVar, 0).b(arnb.a);
            case 1:
                arpe arpeVar2 = (arpe) obj;
                Object obj5 = this.b;
                Object obj6 = this.c;
                Object obj7 = this.e;
                aqsm aqsmVar = (aqsm) obj7;
                return new icy((idb) obj5, (abmu) obj6, aqsmVar, (arlq) this.f, (Duration) this.d, arpeVar2, 1).b(arnb.a);
            case 2:
                arpe arpeVar3 = (arpe) obj;
                Object obj8 = this.b;
                Object obj9 = this.c;
                Object obj10 = this.e;
                aqsm aqsmVar2 = (aqsm) obj10;
                return new icy((lxo) obj8, (abni) obj9, aqsmVar2, (arlq) this.f, (Duration) this.d, arpeVar3, 2).b(arnb.a);
            case 3:
                arpe arpeVar4 = (arpe) obj;
                Object obj11 = this.c;
                Object obj12 = this.e;
                Object obj13 = this.b;
                Object obj14 = this.f;
                anjp anjpVar = (anjp) obj13;
                return new icy((anki) obj11, (aqfn) obj12, anjpVar, (aqgo) obj14, (Instant) this.d, arpeVar4, 3).b(arnb.a);
            case 4:
                arpe arpeVar5 = (arpe) obj;
                Object obj15 = this.b;
                Object obj16 = this.c;
                Object obj17 = this.f;
                Object obj18 = this.e;
                aqgz aqgzVar = (aqgz) obj17;
                return new icy((anki) obj15, (aqfn) obj16, aqgzVar, (aqfn) obj18, (Instant) this.d, arpeVar5, 4).b(arnb.a);
            case 5:
                arpe arpeVar6 = (arpe) obj;
                Object obj19 = this.e;
                Object obj20 = this.d;
                return new icy((aogy) obj19, (String) obj20, (anji) this.b, (Iterable) this.f, (anky) this.c, arpeVar6, 5).b(arnb.a);
            case 6:
                arpe arpeVar7 = (arpe) obj;
                Object obj21 = this.e;
                Object obj22 = this.d;
                return new icy((aogy) obj21, (String) obj22, (anji) this.b, this.f, this.c, arpeVar7, 6, null).b(arnb.a);
            default:
                arpe arpeVar8 = (arpe) obj;
                Object obj23 = this.f;
                Object obj24 = this.d;
                Object obj25 = this.c;
                anjp anjpVar2 = (anjp) obj25;
                return new icy((aogy) obj23, (String) obj24, anjpVar2, (anji) this.b, (anky) this.e, arpeVar8, 7).b(arnb.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x03bd, code lost:
    
        if (r1.a((j$.time.Duration) r2, r13, r12) == r0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03c3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0399, code lost:
    
        if (r13 != r0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0411, code lost:
    
        if (r1.c((j$.time.Duration) r2, (java.util.UUID) r4, r13, r12) == r0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0417, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03e9, code lost:
    
        if (r13 != r0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0435, code lost:
    
        if (r13 != r0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
    
        if (r13 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0032, code lost:
    
        if (r13 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018b, code lost:
    
        if (r13 == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0193, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x041d, code lost:
    
        if (r2 != 1) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f4, code lost:
    
        if (r13 != r0) goto L37;
     */
    /* JADX WARN: Type inference failed for: r0v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r1v50, types: [anjr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v67, types: [anjr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v79, types: [anjr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v31, types: [anky, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v34, types: [anky, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v45, types: [anky, java.lang.Object] */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 1290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.icy.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icy(anki ankiVar, aqfn aqfnVar, aqgz aqgzVar, aqfn aqfnVar2, Instant instant, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.g = i;
        this.b = ankiVar;
        this.c = aqfnVar;
        this.f = aqgzVar;
        this.e = aqfnVar2;
        this.d = instant;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icy(aogy aogyVar, String str, anji anjiVar, Iterable iterable, anky ankyVar, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.g = i;
        this.e = aogyVar;
        this.d = str;
        this.b = anjiVar;
        this.f = iterable;
        this.c = ankyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icy(aogy aogyVar, String str, anji anjiVar, Iterable iterable, anky ankyVar, arpe arpeVar, int i, byte[] bArr) {
        super(1, arpeVar);
        this.g = i;
        this.e = aogyVar;
        this.d = str;
        this.b = anjiVar;
        this.f = iterable;
        this.c = ankyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icy(aogy aogyVar, String str, anjp anjpVar, anji anjiVar, anky ankyVar, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.g = i;
        this.f = aogyVar;
        this.d = str;
        this.c = anjpVar;
        this.b = anjiVar;
        this.e = ankyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icy(idb idbVar, abmu abmuVar, aqsm aqsmVar, arlq arlqVar, Duration duration, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.g = i;
        this.b = idbVar;
        this.c = abmuVar;
        this.e = aqsmVar;
        this.f = arlqVar;
        this.d = duration;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icy(idb idbVar, abmy abmyVar, UUID uuid, arlq arlqVar, Duration duration, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.g = i;
        this.b = idbVar;
        this.c = abmyVar;
        this.d = uuid;
        this.e = arlqVar;
        this.f = duration;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icy(lxo lxoVar, abni abniVar, aqsm aqsmVar, arlq arlqVar, Duration duration, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.g = i;
        this.b = lxoVar;
        this.c = abniVar;
        this.e = aqsmVar;
        this.f = arlqVar;
        this.d = duration;
    }
}
