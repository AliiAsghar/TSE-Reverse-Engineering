package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class svp extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(Iterable iterable) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 46020) {
            agnc.t("reacted_message_id", intValue);
        }
        alob alobVar = new alob();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            alobVar.h(String.valueOf(rvc.a((MessageIdType) it.next())));
        }
        U(new agmf("message_reactions.reacted_message_id", 3, X(alobVar.g()), true));
    }
}
