package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.ims.util.common.RcsIntents;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqy extends wng {
    private static final xze b = xze.g("Bugle", "PopupListener");
    boolean a = false;
    private final aksr c;
    private final lqx d;

    public lqy(aksr aksrVar, lqx lqxVar) {
        this.c = aksrVar;
        this.d = lqxVar;
    }

    @Override // defpackage.wng
    public final akrc a() {
        return this.c.b("PopupListener Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.wng
    public final void c(Context context, Intent intent) {
        char c;
        xyo c2 = b.c();
        c2.H("Received request");
        c2.H(intent.getAction());
        c2.q();
        String action = intent.getAction();
        switch (action.hashCode()) {
            case -1567985380:
                if (action.equals(RcsIntents.ACTION_NOTIFY_RECEIVED_CARRIER_TOS_REQUEST)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -482560605:
                if (action.equals(RcsIntents.ACTION_NOTIFY_RECEIVED_GOOGLE_TOS_REQUEST)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -61934465:
                if (action.equals(RcsIntents.ACTION_NOTIFY_RECEIVED_LEGAL_FYI_REQUEST)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 250542075:
                if (action.equals(RcsIntents.ACTION_NOTIFY_RECEIVED_RCS_SUCCESS_REQUEST)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 406935855:
                if (action.equals(RcsIntents.ACTION_NOTIFY_RECEIVED_RCS_PROMO_REQUEST)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 615574789:
                if (action.equals(RcsIntents.ACTION_NOTIFY_RECEIVED_PROVISIONING_WELCOME_MESSAGE)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c == 5) {
                                this.d.d(5);
                                return;
                            }
                            throw new AssertionError("unexpected intent: ".concat(String.valueOf(String.valueOf(intent))));
                        }
                        this.d.d(4);
                        return;
                    }
                    this.d.d(3);
                    return;
                }
                this.d.d(15);
                return;
            }
            this.d.d(7);
            return;
        }
        this.d.d(2);
    }

    @Override // defpackage.wng
    protected final int e() {
        return 18;
    }

    public final synchronized void f(Context context) {
        if (!this.a) {
            IntentFilter intentFilter = new IntentFilter(RcsIntents.ACTION_NOTIFY_RECEIVED_PROVISIONING_WELCOME_MESSAGE);
            intentFilter.addAction(RcsIntents.ACTION_NOTIFY_RECEIVED_RCS_PROMO_REQUEST);
            intentFilter.addAction(RcsIntents.ACTION_NOTIFY_RECEIVED_RCS_SUCCESS_REQUEST);
            intentFilter.addAction(RcsIntents.ACTION_NOTIFY_RECEIVED_GOOGLE_TOS_REQUEST);
            intentFilter.addAction(RcsIntents.ACTION_NOTIFY_RECEIVED_LEGAL_FYI_REQUEST);
            intentFilter.addAction(RcsIntents.ACTION_NOTIFY_RECEIVED_CARRIER_TOS_REQUEST);
            intentFilter.countActions();
            egl.h(context, this, intentFilter);
            this.a = true;
        }
    }

    public final synchronized void g(Context context) {
        if (this.a) {
            context.unregisterReceiver(this);
            this.a = false;
        }
    }
}
