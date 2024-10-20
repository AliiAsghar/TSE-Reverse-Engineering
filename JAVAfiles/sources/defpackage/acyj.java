package defpackage;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes.dex */
public class acyj {
    public String a;
    public acyr b;
    protected HandlerThread c;

    public acyj() {
    }

    public final Message a(int i) {
        return Message.obtain(this.b, i);
    }

    public final Message b(int i, Object obj) {
        return Message.obtain(this.b, i, obj);
    }

    public final Message c(int i, int i2, int i3, Object obj) {
        return Message.obtain(this.b, i, i2, i3, obj);
    }

    public final acyh d() {
        acyr acyrVar = this.b;
        if (acyrVar == null) {
            return null;
        }
        return acyrVar.b();
    }

    public final void e(acyh acyhVar) {
        this.b.c(acyhVar, null);
    }

    public final void f(acyh acyhVar, acyh acyhVar2) {
        this.b.c(acyhVar, acyhVar2);
    }

    public final void g(Message message) {
        acyr acyrVar = this.b;
        Message obtainMessage = acyrVar.obtainMessage();
        obtainMessage.copyFrom(message);
        acyrVar.l.add(obtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(String str) {
        Log.e(this.a, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(String str) {
        Log.i(this.a, str);
    }

    public final void m() {
        i("quit");
        acyr acyrVar = this.b;
        if (acyrVar == null) {
            return;
        }
        acyrVar.sendMessage(acyrVar.obtainMessage(-1, acyr.a));
    }

    public final void n() {
        i("quitNow");
        acyr acyrVar = this.b;
        if (acyrVar == null) {
            return;
        }
        acyrVar.sendMessageAtFrontOfQueue(acyrVar.obtainMessage(-1, acyr.a));
    }

    public final void o(acyg acygVar) {
        this.b.i.add(acygVar);
    }

    public final void p(int i) {
        acyr acyrVar = this.b;
        if (acyrVar == null) {
            return;
        }
        acyrVar.removeMessages(i);
    }

    public final void q(int i) {
        acyr acyrVar = this.b;
        if (acyrVar == null) {
            return;
        }
        acyrVar.sendMessage(a(i));
    }

    public final void r(int i, int i2) {
        acyr acyrVar = this.b;
        if (acyrVar == null) {
            return;
        }
        acyrVar.sendMessage(Message.obtain(acyrVar, i, i2, 0));
    }

    public final void s(int i, Object obj) {
        acyr acyrVar = this.b;
        if (acyrVar == null) {
            return;
        }
        acyrVar.sendMessage(b(i, obj));
    }

    public final void t(int i, long j) {
        acyr acyrVar = this.b;
        if (acyrVar == null) {
            return;
        }
        acyrVar.sendMessageDelayed(a(i), j);
    }

    public final String toString() {
        String str;
        String str2 = "(null)";
        try {
            str = this.a.toString();
            try {
                str2 = this.b.b().a().toString();
            } catch (NullPointerException unused) {
            }
        } catch (NullPointerException unused2) {
            str = "(null)";
        }
        return a.cg(str2, str, "name=", " state=");
    }

    public final void u(acyh acyhVar) {
        this.b.k = acyhVar;
    }

    public void v() {
        acyh acyhVar;
        i(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME);
        acyr acyrVar = this.b;
        if (acyrVar == null) {
            return;
        }
        int i = 0;
        for (acyq acyqVar : acyrVar.j.values()) {
            int i2 = 0;
            for (; acyqVar != null; acyqVar = acyqVar.b) {
                i2++;
            }
            if (i < i2) {
                i = i2;
            }
        }
        acyrVar.b = new acyq[i];
        acyrVar.d = new acyq[i];
        if (acyrVar.k == null) {
            acyq acyqVar2 = null;
            acyq acyqVar3 = null;
            for (acyq acyqVar4 : acyrVar.j.values()) {
                if (acyqVar4.b == null && (acyhVar = acyqVar4.a) != acyrVar.f && acyhVar != acyrVar.g) {
                    if (acyqVar3 == null) {
                        acyqVar3 = acyqVar4;
                    } else {
                        Log.e(acyrVar.h.a, "state machines with multiple root states must be initialized via setInitialstate");
                    }
                }
            }
            if (acyqVar3 == null) {
                Log.e(acyrVar.h.a, "state machines must contain a root state");
            } else {
                acyqVar2 = acyqVar3;
            }
            acyrVar.k = acyqVar2.a;
        }
        acyq acyqVar5 = (acyq) acyrVar.j.get(acyrVar.k);
        acyrVar.e = 0;
        while (acyqVar5 != null) {
            acyq[] acyqVarArr = acyrVar.d;
            int i3 = acyrVar.e;
            acyqVarArr[i3] = acyqVar5;
            acyqVar5 = acyqVar5.b;
            acyrVar.e = i3 + 1;
        }
        acyrVar.c = -1;
        acyrVar.a();
        acyrVar.f();
    }

    public final void w(acyh acyhVar) {
        this.b.e(acyhVar);
        l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public acyj(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        this.c = handlerThread;
        agki.a(handlerThread);
        this.c.start();
        Looper looper = this.c.getLooper();
        this.a = str;
        this.b = new acyr(looper, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k() {
    }

    protected void l() {
    }
}
