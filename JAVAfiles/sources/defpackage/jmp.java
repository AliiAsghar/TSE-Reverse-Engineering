package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmp extends arrp implements arqg {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmp(Object obj, boolean z, int i) {
        super(0);
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [ascv, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        alor alorVar;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                efu efuVar = null;
                if (i != 2) {
                    View view = (View) this.b;
                    if (Build.VERSION.SDK_INT >= 30) {
                        efuVar = eef.a(view);
                    } else {
                        Context context = view.getContext();
                        while (true) {
                            if (!(context instanceof ContextWrapper)) {
                                break;
                            }
                            if (context instanceof Activity) {
                                Window window = ((Activity) context).getWindow();
                                if (window != null) {
                                    efuVar = new efu(window, view);
                                }
                            } else {
                                context = ((ContextWrapper) context).getBaseContext();
                            }
                        }
                    }
                    if (efuVar != null) {
                        efuVar.b(!this.a);
                    }
                    return arnb.a;
                }
                if (this.a) {
                    Object obj = this.b;
                    akrc b = ((jsa) obj).g.b("ComposeRowSendButton.onSend");
                    try {
                        if (!((jsa) obj).n.compareAndSet(false, true)) {
                            alvw g = jsa.a.g();
                            g.X(alwp.a, "BugleComposeRow2");
                            ((alvg) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/SendButtonUiAdapterImpl", "onSend", 161, "SendButtonUiAdapterImpl.kt")).q("Skipping SendButtonUiAdapterImpl.onSend");
                        } else {
                            jhc jhcVar = (jhc) ((jsa) obj).q.a.c();
                            if (((jsa) obj).l.a()) {
                                alorVar = alzz.bc(((jsa) obj).k.b);
                            } else {
                                alorVar = null;
                            }
                            qjh.l(((jsa) obj).f, ((jsa) obj).d, new gvr((jsa) obj, jhcVar, alorVar, (arpe) null, 19, (byte[]) null), 2);
                        }
                        armd.i(b, null);
                    } finally {
                    }
                } else {
                    ((jsa) this.b).c();
                }
                return arnb.a;
            }
            ((rg) this.b).h(this.a);
            return arnb.a;
        }
        if (this.a) {
            ((kbn) this.b).a();
        } else {
            ((kbn) this.b).b();
        }
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmp(boolean z, Object obj, int i) {
        super(0);
        this.c = i;
        this.a = z;
        this.b = obj;
    }
}
