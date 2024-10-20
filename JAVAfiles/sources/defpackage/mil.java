package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mil implements rwt {
    private final mii a;

    public mil(mii miiVar) {
        miiVar.getClass();
        this.a = miiVar;
    }

    @Override // defpackage.rwt
    public final void b(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        messageIdType.getClass();
        if (((Boolean) ((utz) mik.c.get()).e()).booleanValue()) {
            this.a.b();
        }
    }

    @Override // defpackage.rwt
    public final boolean fJ() {
        Object e = ((utz) mik.c.get()).e();
        e.getClass();
        return ((Boolean) e).booleanValue();
    }

    @Override // defpackage.rwt
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.rwt
    public final /* synthetic */ void fK() {
    }

    @Override // defpackage.rwt
    public final /* synthetic */ void fL() {
    }

    @Override // defpackage.rwt
    public final /* synthetic */ Object a(MessageCoreData messageCoreData, List list, arpe arpeVar) {
        return messageCoreData;
    }
}
