package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gaf extends arpw implements arqv {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gaf(arrz arrzVar, asaj asajVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.c = arrzVar;
        this.b = asajVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return ((gaf) c(new arzn(((arzn) obj).b), (arpe) obj2)).b(arnb.a);
                        }
                        return ((gaf) c((asaj) obj, (arpe) obj2)).b(arnb.a);
                    }
                    return ((gaf) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                }
                return ((gaf) c((gdt) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((gaf) c((gdt) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((gaf) c((asaj) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [arzx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [asaj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, arxm] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r2v7, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, arqw] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object, arqv] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object obj2;
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            arpl arplVar = arpl.a;
                            if (this.a != 0) {
                                obj2 = this.d;
                                aqil.P(obj);
                            } else {
                                aqil.P(obj);
                                Object obj3 = ((arzn) this.d).b;
                                ((arrz) this.c).a++;
                                ?? r2 = this.b;
                                if (!(obj3 instanceof arzm)) {
                                    this.d = obj3;
                                    this.a = 1;
                                    if (r2.fv(obj3, this) == arplVar) {
                                        return arplVar;
                                    }
                                }
                                obj2 = obj3;
                            }
                            if (obj2 instanceof arzl) {
                                arzn.b(obj2);
                                return false;
                            }
                            return true;
                        }
                        arpl arplVar2 = arpl.a;
                        if (this.a != 0) {
                            aqil.P(obj);
                        } else {
                            aqil.P(obj);
                            asaj asajVar = (asaj) this.d;
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            ?? r3 = this.b;
                            gah gahVar = new gah((Set) linkedHashSet, (arqv) this.c, asajVar, 11);
                            this.a = 1;
                            if (r3.a(gahVar, this) == arplVar2) {
                                return arplVar2;
                            }
                        }
                        return arnb.a;
                    }
                    arpl arplVar3 = arpl.a;
                    if (this.a != 0) {
                        aqil.P(obj);
                    } else {
                        aqil.P(obj);
                        gdu gduVar = new gdu((arwe) this.d, this.b);
                        ?? r8 = this.c;
                        this.a = 1;
                        if (r8.a(gduVar, this) == arplVar3) {
                            return arplVar3;
                        }
                    }
                    return arnb.a;
                }
                arpl arplVar4 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    gdt gdtVar = (gdt) this.d;
                    ?? r22 = this.b;
                    gbz gbzVar = new gbz((arqw) this.c, new fzt(gdtVar), (arpe) null, 1);
                    this.a = 1;
                    if (armd.q(r22, gbzVar, this) == arplVar4) {
                        return arplVar4;
                    }
                }
                return arnb.a;
            }
            arpl arplVar5 = arpl.a;
            if (this.a != 0) {
                aqil.P(obj);
            } else {
                aqil.P(obj);
                gdt gdtVar2 = (gdt) this.d;
                this.b.s(new rh(gdtVar2, 13));
                ?? r23 = this.c;
                this.a = 1;
                if (r23.a(gdtVar2, this) == arplVar5) {
                    return arplVar5;
                }
            }
            return arnb.a;
        }
        arpl arplVar6 = arpl.a;
        if (this.a != 0) {
            aqil.P(obj);
        } else {
            aqil.P(obj);
            asaj asajVar2 = (asaj) this.d;
            arsb arsbVar = new arsb();
            arsbVar.a = gai.a;
            ?? r32 = this.b;
            gah gahVar2 = new gah(arsbVar, this.c, asajVar2, 1);
            this.a = 1;
            if (r32.a(gahVar2, this) == arplVar6) {
                return arplVar6;
            }
        }
        return arnb.a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [asaj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, arqw] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, arxm] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, arzj] */
    /* JADX WARN: Type inference failed for: r2v3, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r5v0, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, arqw] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            gaf gafVar = new gaf((arrz) this.c, (asaj) this.b, arpeVar, 5);
                            gafVar.d = obj;
                            return gafVar;
                        }
                        gaf gafVar2 = new gaf((asai) this.b, (arqv) this.c, arpeVar, 4);
                        gafVar2.d = obj;
                        return gafVar2;
                    }
                    gaf gafVar3 = new gaf((arzj) this.b, (arqv) this.c, arpeVar, 3);
                    gafVar3.d = obj;
                    return gafVar3;
                }
                gaf gafVar4 = new gaf(this.b, this.c, arpeVar, 2, null);
                gafVar4.d = obj;
                return gafVar4;
            }
            gaf gafVar5 = new gaf((arxm) this.b, (arqv) this.c, arpeVar, 1);
            gafVar5.d = obj;
            return gafVar5;
        }
        gaf gafVar6 = new gaf((asai) this.b, (arqw) this.c, arpeVar, 0);
        gafVar6.d = obj;
        return gafVar6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gaf(arxm arxmVar, arqv arqvVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.b = arxmVar;
        this.c = arqvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gaf(arzj arzjVar, arqv arqvVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.b = arzjVar;
        this.c = arqvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gaf(asai asaiVar, arqv arqvVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.b = asaiVar;
        this.c = arqvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gaf(asai asaiVar, arqw arqwVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.b = asaiVar;
        this.c = arqwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gaf(asai asaiVar, arqw arqwVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.e = i;
        this.b = asaiVar;
        this.c = arqwVar;
    }
}
