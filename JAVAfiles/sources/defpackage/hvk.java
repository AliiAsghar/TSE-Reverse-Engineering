package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvk implements Handler.Callback {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hvk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        int i2 = message.arg1;
                        Object obj = this.a;
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", a.bV(i2, "Received response to request: "));
                        }
                        synchronized (obj) {
                            acbs acbsVar = (acbs) ((acbr) obj).d.get(i2);
                            if (acbsVar == null) {
                                Log.w("MessengerIpcClient", a.bV(i2, "Received response for unknown request: "));
                            } else {
                                ((acbr) obj).d.remove(i2);
                                ((acbr) obj).e();
                                Bundle data = message.getData();
                                if (data.getBoolean("unsupported", false)) {
                                    acbsVar.a(new acbt(4, "Not supported by GmsCore"));
                                } else {
                                    Bundle bundle = data.getBundle(GroupManagementRequest.DATA_TAG);
                                    if (bundle == null) {
                                        bundle = Bundle.EMPTY;
                                    }
                                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                                        Log.d("MessengerIpcClient", "Finishing " + acbsVar.toString() + " with " + String.valueOf(bundle));
                                    }
                                    acbsVar.b.b(bundle);
                                }
                            }
                        }
                        return true;
                    }
                    int i3 = message.what;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            return false;
                        }
                        synchronized (((abui) this.a).d) {
                            abuh abuhVar = (abuh) message.obj;
                            abuj abujVar = (abuj) ((abui) this.a).d.get(abuhVar);
                            if (abujVar != null && abujVar.b == 3) {
                                Log.e("GmsClientSupervisor", a.cr(abuhVar, "Timeout waiting for ServiceConnection callback "), new Exception());
                                ComponentName componentName = abujVar.f;
                                if (componentName == null) {
                                    componentName = abuhVar.d;
                                }
                                if (componentName == null) {
                                    String str = abuhVar.c;
                                    abhg.m(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                abujVar.onServiceDisconnected(componentName);
                            }
                        }
                    } else {
                        synchronized (((abui) this.a).d) {
                            abuh abuhVar2 = (abuh) message.obj;
                            abuj abujVar2 = (abuj) ((abui) this.a).d.get(abuhVar2);
                            if (abujVar2 != null && abujVar2.b()) {
                                if (abujVar2.c) {
                                    abujVar2.g.f.removeMessages(1, abujVar2.e);
                                    abui abuiVar = abujVar2.g;
                                    abuiVar.g.b(abuiVar.e, abujVar2);
                                    abujVar2.c = false;
                                    abujVar2.b = 2;
                                }
                                ((abui) this.a).d.remove(abuhVar2);
                            }
                        }
                    }
                    return true;
                }
                int i4 = message.arg1;
                Object obj2 = this.a;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", a.bV(i4, "Received response to request: "));
                }
                synchronized (obj2) {
                    abph abphVar = (abph) ((abpf) obj2).d.get(i4);
                    if (abphVar == null) {
                        Log.w("MessengerIpcClient", a.bV(i4, "Received response for unknown request: "));
                    } else {
                        ((abpf) obj2).d.remove(i4);
                        ((abpf) obj2).d();
                        Bundle data2 = message.getData();
                        if (data2.getBoolean("unsupported", false)) {
                            abphVar.c(new abpi("Not supported by GmsCore"));
                        } else {
                            abphVar.a(data2);
                        }
                    }
                }
                return true;
            }
            ety etyVar = (ety) this.a;
            Iterator it = etyVar.c.iterator();
            while (it.hasNext()) {
                etx etxVar = (etx) it.next();
                etw etwVar = etyVar.b;
                if (!etxVar.c && etxVar.b) {
                    eql b = etxVar.d.b();
                    etxVar.d = new apvo((char[]) null);
                    etxVar.b = false;
                    etwVar.a(etxVar.a, b);
                }
                if (etyVar.a.c()) {
                    break;
                }
            }
            return true;
        }
        if (message.what == 1) {
            ((hvl) this.a).c((hvj) message.obj);
            return true;
        }
        if (message.what != 2) {
            return false;
        }
        ((hvl) this.a).c.j((hvj) message.obj);
        return false;
    }

    public /* synthetic */ hvk(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
