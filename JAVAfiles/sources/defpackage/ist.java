package defpackage;

import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ist implements akbp<MessageIdType, Boolean> {
    final /* synthetic */ itb a;

    public ist(itb itbVar) {
        this.a = itbVar;
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        MessageIdType messageIdType = (MessageIdType) obj;
        if (th instanceof CancellationException) {
        } else {
            throw new IllegalArgumentException("Failure to load messages around messageId ".concat(String.valueOf(String.valueOf(messageIdType))), th);
        }
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        int a = this.a.aq.a((MessageIdType) obj);
        if (((Boolean) obj2).booleanValue()) {
            this.a.t(a);
        } else {
            itb itbVar = this.a;
            itbVar.ap.ar(itbVar.ao, a);
        }
        if (this.a.f.x() != null) {
            this.a.an.o();
        }
        if (((Boolean) abal.e.e()).booleanValue()) {
            final int intValue = ((Integer) abal.f.e()).intValue();
            final int intValue2 = ((Integer) abal.g.e()).intValue();
            this.a.e().ifPresent(new Consumer() { // from class: iss
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void q(Object obj3) {
                    ((View) obj3).animate().alpha(brg.a).setStartDelay(intValue).setDuration(intValue2).start();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
