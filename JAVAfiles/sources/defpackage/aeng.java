package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aeng extends arrp implements arqw {
    final /* synthetic */ boolean a;
    final /* synthetic */ aenw b;
    final /* synthetic */ aeoa c;
    final /* synthetic */ boolean d;
    final /* synthetic */ aeoo e;
    final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeng(boolean z, aenw aenwVar, aeoa aeoaVar, boolean z2, aeoo aeooVar, float f) {
        super(3);
        this.a = z;
        this.b = aenwVar;
        this.c = aeoaVar;
        this.d = z2;
        this.e = aeooVar;
        this.f = f;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        aerb aerbVar;
        cor bg;
        long j;
        aerb aerbVar2;
        int i;
        ake akeVar = (ake) obj;
        bwj bwjVar = (bwj) obj2;
        int intValue = ((Number) obj3).intValue();
        akeVar.getClass();
        boolean z = true;
        if ((intValue & 14) == 0) {
            if (true != bwjVar.G(akeVar)) {
                i = 2;
            } else {
                i = 4;
            }
            intValue |= i;
        }
        if ((intValue & 91) == 18 && bwjVar.L()) {
            bwjVar.v();
        } else {
            if (this.a) {
                bwjVar.y(-785312228);
                aenw aenwVar = this.b;
                aeoa aeoaVar = this.c;
                bwjVar.y(2056513199);
                aeny aenyVar = aeoaVar.a;
                int ordinal = aenwVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    if (ordinal == 5) {
                                        aerbVar2 = aerb.ar;
                                    } else {
                                        throw new armm();
                                    }
                                } else if (aenwVar == aenyVar) {
                                    aerbVar2 = aerb.g;
                                } else {
                                    aerbVar2 = aerb.f;
                                }
                            } else if (aenwVar == aenyVar) {
                                aerbVar2 = aerb.ai;
                            } else {
                                aerbVar2 = aerb.ah;
                            }
                        } else if (aenwVar == aenyVar) {
                            aerbVar2 = aerb.am;
                        } else {
                            aerbVar2 = aerb.aj;
                        }
                    } else if (aenwVar == aenyVar) {
                        aerbVar2 = aerb.ao;
                    } else {
                        aerbVar2 = aerb.an;
                    }
                } else if (aenwVar == aenyVar) {
                    aerbVar2 = aerb.ch;
                } else {
                    aerbVar2 = aerb.cg;
                }
                bg = aeke.bg(aerbVar2, bwjVar);
                bwjVar.q();
                bwjVar.q();
            } else {
                bwjVar.y(-785219290);
                aenw aenwVar2 = this.b;
                aeoa aeoaVar2 = this.c;
                bwjVar.y(-1749598806);
                aeny aenyVar2 = aeoaVar2.a;
                int ordinal2 = aenwVar2.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                if (ordinal2 != 4) {
                                    if (ordinal2 == 5) {
                                        aerbVar = aerb.ar;
                                    } else {
                                        throw new armm();
                                    }
                                } else if (aenwVar2 == aenyVar2) {
                                    aerbVar = aerb.ag;
                                } else {
                                    aerbVar = aerb.af;
                                }
                            } else if (aenwVar2 == aenyVar2) {
                                aerbVar = aerb.ai;
                            } else {
                                aerbVar = aerb.ah;
                            }
                        } else if (aenwVar2 == aenyVar2) {
                            aerbVar = aerb.al;
                        } else {
                            aerbVar = aerb.ak;
                        }
                    } else if (aenwVar2 == aenyVar2) {
                        aerbVar = aerb.bK;
                    } else {
                        aerbVar = aerb.bJ;
                    }
                } else if (aenwVar2 == aenyVar2) {
                    aerbVar = aerb.ch;
                } else {
                    aerbVar = aerb.cg;
                }
                bg = aeke.bg(aerbVar, bwjVar);
                bwjVar.q();
                bwjVar.q();
            }
            cor corVar = bg;
            if (cku.a(((cku) bwjVar.g(blp.a)).i) == 1.0f) {
                bwjVar.y(-784936880);
                j = bmp.a(bwjVar).s;
                bwjVar.q();
            } else {
                bwjVar.y(-785061221);
                j = ((cku) bwjVar.g(blp.a)).i;
                bwjVar.q();
            }
            long j2 = j;
            aenw aenwVar3 = this.b;
            if (aenwVar3 != this.c.a) {
                z = false;
            }
            adom.aN(corVar, adom.aV(aenwVar3, z, bwjVar), null, j2, bwjVar, 8, 4);
            if (this.d) {
                akc.b(adf.a(amh.d(adl.b(akeVar.a(amv.h(cga.e, 8.0f), new cfs(0.9f, -0.9f)), ads.a(1.2f, adom.aW(this.e, this.f, bwjVar)), awh.a), 1.0f), bmp.a(bwjVar).a, awh.a), bwjVar, 0);
            }
        }
        return arnb.a;
    }
}
