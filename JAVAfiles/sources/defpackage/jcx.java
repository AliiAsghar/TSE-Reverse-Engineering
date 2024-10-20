package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jcx extends arpw implements arqv {
    int a;
    private /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcx(arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return ((jcx) c((nfw) obj, (arpe) obj2)).b(arnb.a);
                        }
                        return ((jcx) c((asaj) obj, (arpe) obj2)).b(arnb.a);
                    }
                    return ((jcx) c((jjg) obj, (arpe) obj2)).b(arnb.a);
                }
                return ((jcx) c((asaj) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((jcx) c((asaj) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((jcx) c((asaj) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        asaj asajVar;
        gdp gdpVar;
        jjg jjgVar;
        int i = this.c;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            arpl arplVar = arpl.a;
                            int i2 = this.a;
                            aqil.P(obj);
                            if (i2 == 0) {
                                akul b = ((nfw) this.b).d().b();
                                b.getClass();
                                this.a = 1;
                                obj = arro.F(b, this);
                                if (obj == arplVar) {
                                    return arplVar;
                                }
                            }
                            return Boolean.valueOf(((ngh) obj).a());
                        }
                        arpl arplVar2 = arpl.a;
                        if (this.a != 0) {
                            aqil.P(obj);
                        } else {
                            aqil.P(obj);
                            asaj asajVar2 = (asaj) this.b;
                            this.a = 1;
                            if (asajVar2.fv(null, this) == arplVar2) {
                                return arplVar2;
                            }
                        }
                        return arnb.a;
                    }
                    arpl arplVar3 = arpl.a;
                    if (this.a != 0) {
                        jjgVar = (jjg) this.b;
                        aqil.P(obj);
                    } else {
                        aqil.P(obj);
                        jjg jjgVar2 = (jjg) this.b;
                        if (jjgVar2 == jjg.a) {
                            long j = jsa.b;
                            this.b = jjgVar2;
                            this.a = 1;
                            if (arwi.n(j, this) == arplVar3) {
                                return arplVar3;
                            }
                        }
                        jjgVar = jjgVar2;
                    }
                    if (jjgVar != null) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                arpl arplVar4 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    asaj asajVar3 = (asaj) this.b;
                    this.a = 1;
                    if (asajVar3.fv(false, this) == arplVar4) {
                        return arplVar4;
                    }
                }
                return arnb.a;
            }
            arpl arplVar5 = arpl.a;
            int i3 = this.a;
            if (i3 != 0) {
                if (i3 != 1) {
                    aqil.P(obj);
                    return arnb.a;
                }
                asajVar = (asaj) this.b;
                aqil.P(obj);
                gdpVar = (gdp) obj;
            } else {
                aqil.P(obj);
                asajVar = (asaj) this.b;
                gdpVar = null;
            }
            if (gdpVar != gdp.LAUNCH_INITIAL_REFRESH) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            this.b = null;
            this.a = 2;
            if (asajVar.fv(valueOf, this) == arplVar5) {
                return arplVar5;
            }
            return arnb.a;
        }
        arpl arplVar6 = arpl.a;
        if (this.a != 0) {
            aqil.P(obj);
        } else {
            aqil.P(obj);
            asaj asajVar4 = (asaj) this.b;
            this.a = 1;
            if (asajVar4.fv(null, this) == arplVar6) {
                return arplVar6;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            jcx jcxVar = new jcx(arpeVar, 5, (boolean[]) null);
                            jcxVar.b = obj;
                            return jcxVar;
                        }
                        jcx jcxVar2 = new jcx(arpeVar, 4, (int[]) null);
                        jcxVar2.b = obj;
                        return jcxVar2;
                    }
                    jcx jcxVar3 = new jcx(arpeVar, 3, (short[]) null);
                    jcxVar3.b = obj;
                    return jcxVar3;
                }
                jcx jcxVar4 = new jcx(arpeVar, 2, (char[]) null);
                jcxVar4.b = obj;
                return jcxVar4;
            }
            jcx jcxVar5 = new jcx(arpeVar, 1, (byte[]) null);
            jcxVar5.b = obj;
            return jcxVar5;
        }
        jcx jcxVar6 = new jcx(arpeVar, 0);
        jcxVar6.b = obj;
        return jcxVar6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcx(arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcx(arpe arpeVar, int i, char[] cArr) {
        super(2, arpeVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcx(arpe arpeVar, int i, int[] iArr) {
        super(2, arpeVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcx(arpe arpeVar, int i, short[] sArr) {
        super(2, arpeVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcx(arpe arpeVar, int i, boolean[] zArr) {
        super(2, arpeVar);
        this.c = i;
    }
}
