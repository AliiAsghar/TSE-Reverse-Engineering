package defpackage;

import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ivd implements Consumer {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ ivd(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                aabp aabpVar = (aabp) obj;
                                xze xzeVar = zri.a;
                                if (aabpVar != null) {
                                    if (this.a) {
                                        aabpVar.y(1);
                                        aabpVar.b.S();
                                        return;
                                    } else {
                                        aabpVar.c.a(true);
                                        return;
                                    }
                                }
                                return;
                            }
                            inn innVar = (inn) obj;
                            xze xzeVar2 = zri.a;
                            if (this.a) {
                                innVar.r(ins.IME, true, false);
                                return;
                            } else {
                                innVar.h(false);
                                return;
                            }
                        }
                        ((kmj) obj).e = this.a;
                        return;
                    }
                    ((kmk) obj).d(this.a);
                    return;
                }
                alvi alviVar = ixd.a;
                ((ComposeMessageView) obj).E().C(this.a);
                return;
            }
            alvi alviVar2 = ixd.a;
            ((inn) obj).h(this.a);
            return;
        }
        alvi alviVar3 = ixd.a;
        ((inn) obj).r(ins.CAMERA_GALLERY, true, this.a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                    return Consumer$CC.$default$andThen(this, consumer);
                }
                return Consumer$CC.$default$andThen(this, consumer);
            }
            return Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
