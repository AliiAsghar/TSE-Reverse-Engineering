package defpackage;

import android.hardware.display.DisplayManager;
import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wse implements UnaryOperator {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ wse(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return Function$CC.$default$andThen(this, function);
                        }
                        return Function$CC.$default$andThen(this, function);
                    }
                    return Function$CC.$default$andThen(this, function);
                }
                return Function$CC.$default$andThen(this, function);
            }
            return Function$CC.$default$andThen(this, function);
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            alhr alhrVar = (alhr) obj;
                            alvi alviVar = abem.a;
                            if (alhrVar == null) {
                                return albo.E(new ynw(this.a, 9), Duration.ofSeconds(((Long) abem.b.e()).longValue()));
                            }
                            return alhrVar;
                        }
                        DisplayManager.DisplayListener displayListener = (DisplayManager.DisplayListener) obj;
                        if (displayListener != null) {
                            return displayListener;
                        }
                        Object obj2 = this.a;
                        return ((wtp) ((wtt) obj2).b.b()).a(new vnq(obj2, 8));
                    }
                    wtm wtmVar = (wtm) obj;
                    if (wtmVar != null) {
                        return wtmVar;
                    }
                    Object obj3 = this.a;
                    final wtt wttVar = (wtt) obj3;
                    return ((wtp) wttVar.b.b()).e(new wtl() { // from class: wtq
                        @Override // defpackage.wtl
                        public final void a(boolean z) {
                            akrh e = aktp.e("ScreenDetectionListener.handleRecordingCallback");
                            wtt wttVar2 = wtt.this;
                            try {
                                if (((wti) wttVar2.c.b()).c()) {
                                    wth wthVar = (wth) wttVar2.f.get();
                                    wttVar2.a(((wtp) wttVar2.b.b()).c(z, wthVar), wthVar);
                                    armd.i(e, null);
                                    return;
                                }
                                throw new IllegalStateException("Does not have version & permission");
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    armd.i(e, th);
                                    throw th2;
                                }
                            }
                        }
                    }, new vnq(obj3, 7));
                }
                return this.a;
            }
            return this.a;
        }
        Object obj4 = this.a;
        obj4.getClass();
        return obj4;
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return Function$CC.$default$compose(this, function);
                        }
                        return Function$CC.$default$compose(this, function);
                    }
                    return Function$CC.$default$compose(this, function);
                }
                return Function$CC.$default$compose(this, function);
            }
            return Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }
}
