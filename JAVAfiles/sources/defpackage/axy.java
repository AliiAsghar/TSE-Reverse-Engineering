package defpackage;

import android.view.KeyEvent;
import defpackage.axx;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axy {
    public static final axv a = new axv() { // from class: axy.1
        @Override // defpackage.axv
        public final axu a(KeyEvent keyEvent) {
            axu axuVar;
            axu axuVar2;
            if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                long b = cpt.b(keyEvent);
                if (a.bB(b, ayl.i)) {
                    axuVar = axu.O;
                } else if (a.bB(b, ayl.j)) {
                    axuVar = axu.P;
                } else if (a.bB(b, ayl.k)) {
                    axuVar = axu.G;
                } else {
                    if (a.bB(b, ayl.l)) {
                        axuVar = axu.H;
                    }
                    axuVar = null;
                }
            } else {
                if (keyEvent.isAltPressed()) {
                    long b2 = cpt.b(keyEvent);
                    if (a.bB(b2, ayl.i)) {
                        axuVar = axu.i;
                    } else if (a.bB(b2, ayl.j)) {
                        axuVar = axu.j;
                    } else if (a.bB(b2, ayl.k)) {
                        axuVar = axu.o;
                    } else if (a.bB(b2, ayl.l)) {
                        axuVar = axu.p;
                    }
                }
                axuVar = null;
            }
            if (axuVar == null) {
                axv axvVar = axx.a;
                if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                    long b3 = cpt.b(keyEvent);
                    if (a.bB(b3, ayl.i)) {
                        axuVar2 = axu.I;
                    } else if (a.bB(b3, ayl.j)) {
                        axuVar2 = axu.J;
                    } else if (a.bB(b3, ayl.k)) {
                        axuVar2 = axu.L;
                    } else {
                        if (a.bB(b3, ayl.l)) {
                            axuVar2 = axu.K;
                        }
                        axuVar2 = null;
                    }
                } else if (keyEvent.isCtrlPressed()) {
                    long b4 = cpt.b(keyEvent);
                    if (a.bB(b4, ayl.i)) {
                        axuVar2 = axu.d;
                    } else if (a.bB(b4, ayl.j)) {
                        axuVar2 = axu.c;
                    } else if (a.bB(b4, ayl.k)) {
                        axuVar2 = axu.f;
                    } else if (a.bB(b4, ayl.l)) {
                        axuVar2 = axu.e;
                    } else if (a.bB(b4, ayl.c)) {
                        axuVar2 = axu.t;
                    } else if (a.bB(b4, ayl.t)) {
                        axuVar2 = axu.w;
                    } else if (a.bB(b4, ayl.s)) {
                        axuVar2 = axu.v;
                    } else {
                        if (a.bB(b4, ayl.h)) {
                            axuVar2 = axu.Q;
                        }
                        axuVar2 = null;
                    }
                } else if (keyEvent.isShiftPressed()) {
                    long b5 = cpt.b(keyEvent);
                    if (a.bB(b5, ayl.o)) {
                        axuVar2 = axu.O;
                    } else {
                        if (a.bB(b5, ayl.p)) {
                            axuVar2 = axu.P;
                        }
                        axuVar2 = null;
                    }
                } else {
                    if (keyEvent.isAltPressed()) {
                        long b6 = cpt.b(keyEvent);
                        if (a.bB(b6, ayl.s)) {
                            axuVar2 = axu.x;
                        } else if (a.bB(b6, ayl.t)) {
                            axuVar2 = axu.y;
                        }
                    }
                    axuVar2 = null;
                }
                if (axuVar2 == null) {
                    axw axwVar = (axw) ((axx.AnonymousClass2) axvVar).a;
                    if (((Boolean) ((arrv) axwVar.a).b(new cps(keyEvent))).booleanValue() && keyEvent.isShiftPressed()) {
                        if (!a.bB(cpt.b(keyEvent), ayl.g)) {
                            return null;
                        }
                        return axu.U;
                    }
                    if (((Boolean) ((arrv) axwVar.a).b(new cps(keyEvent))).booleanValue()) {
                        long b7 = cpt.b(keyEvent);
                        if (!a.bB(b7, ayl.b) && !a.bB(b7, ayl.q)) {
                            if (a.bB(b7, ayl.d)) {
                                return axu.r;
                            }
                            if (a.bB(b7, ayl.f)) {
                                return axu.s;
                            }
                            if (a.bB(b7, ayl.a)) {
                                return axu.z;
                            }
                            if (a.bB(b7, ayl.e)) {
                                return axu.U;
                            }
                            if (!a.bB(b7, ayl.g)) {
                                return null;
                            }
                            return axu.T;
                        }
                        return axu.q;
                    }
                    if (keyEvent.isCtrlPressed()) {
                        return null;
                    }
                    if (keyEvent.isShiftPressed()) {
                        long b8 = cpt.b(keyEvent);
                        if (a.bB(b8, ayl.i)) {
                            return axu.A;
                        }
                        if (a.bB(b8, ayl.j)) {
                            return axu.B;
                        }
                        if (a.bB(b8, ayl.k)) {
                            return axu.C;
                        }
                        if (a.bB(b8, ayl.l)) {
                            return axu.D;
                        }
                        if (a.bB(b8, ayl.m)) {
                            return axu.E;
                        }
                        if (a.bB(b8, ayl.n)) {
                            return axu.F;
                        }
                        if (a.bB(b8, ayl.o)) {
                            return axu.M;
                        }
                        if (a.bB(b8, ayl.p)) {
                            return axu.N;
                        }
                        if (!a.bB(b8, ayl.q)) {
                            return null;
                        }
                        return axu.r;
                    }
                    long b9 = cpt.b(keyEvent);
                    if (a.bB(b9, ayl.i)) {
                        return axu.a;
                    }
                    if (a.bB(b9, ayl.j)) {
                        return axu.b;
                    }
                    if (a.bB(b9, ayl.k)) {
                        return axu.k;
                    }
                    if (a.bB(b9, ayl.l)) {
                        return axu.l;
                    }
                    if (a.bB(b9, ayl.m)) {
                        return axu.m;
                    }
                    if (a.bB(b9, ayl.n)) {
                        return axu.n;
                    }
                    if (a.bB(b9, ayl.o)) {
                        return axu.g;
                    }
                    if (a.bB(b9, ayl.p)) {
                        return axu.h;
                    }
                    if (a.bB(b9, ayl.r)) {
                        return axu.R;
                    }
                    if (a.bB(b9, ayl.s)) {
                        return axu.t;
                    }
                    if (a.bB(b9, ayl.t)) {
                        return axu.u;
                    }
                    if (a.bB(b9, ayl.u)) {
                        return axu.r;
                    }
                    if (a.bB(b9, ayl.v)) {
                        return axu.s;
                    }
                    if (a.bB(b9, ayl.w)) {
                        return axu.q;
                    }
                    if (!a.bB(b9, ayl.x)) {
                        return null;
                    }
                    return axu.S;
                }
                return axuVar2;
            }
            return axuVar;
        }
    };
}
