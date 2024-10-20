package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class isr implements akbp<MessageIdType, Void> {
    final /* synthetic */ itb a;

    public isr(itb itbVar) {
        this.a = itbVar;
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        if (!(th instanceof CancellationException)) {
            xzb.p("Bugle", th, "Error: reminder fired in conversation. ".concat(String.valueOf(String.valueOf(this.a.af))));
        }
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void c(Object obj, Object obj2) {
        irr irrVar = this.a.aq.c;
        alpt keySet = ((alor) irrVar.h).keySet();
        irrVar.d.getClass();
        int i = 0;
        while (true) {
            hk hkVar = irrVar.d;
            if (i < hkVar.g) {
                if (keySet.contains(((rry) hkVar.d(i)).u())) {
                    irrVar.q(i);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
