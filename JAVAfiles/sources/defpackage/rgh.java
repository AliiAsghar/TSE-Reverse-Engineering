package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationEncryptionStatusAction;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rgh implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ rgh(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        boolean z;
        int i = 13;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                if (list == null) {
                    return new ArrayList();
                }
                return (List) Collection.EL.stream(list).filter(new qxi(6)).map(new rbs(16)).collect(Collectors.toCollection(new qxs(i)));
            case 1:
                List list2 = (List) obj;
                if (list2 == null) {
                    return new ArrayList();
                }
                return (List) Collection.EL.stream(list2).filter(new qxi(5)).collect(Collectors.toCollection(new qxs(i)));
            case 2:
                xze xzeVar = UpdateConversationEncryptionStatusAction.a;
                return null;
            case 3:
                return upm.b();
            case 4:
                return Optional.of((String) obj);
            case 5:
                long j = ryx.a;
                apzl apzlVar = ((apzo) obj).b;
                if (apzlVar == null) {
                    apzlVar = apzl.a;
                }
                if (apzlVar.b == 1) {
                    return (apzp) apzlVar.c;
                }
                return apzp.a;
            case 6:
                return upm.b();
            case 7:
                return null;
            case 8:
                tsp.b.r("Failed to setup remote instance session: ", (Throwable) obj);
                return null;
            case 9:
                return null;
            case 10:
                return upm.b();
            case 11:
                byte[][] bArr = (byte[][]) obj;
                aozb w = aozb.w(bArr[0]);
                aozb w2 = aozb.w(bArr[1]);
                if (w.d() == 33) {
                    z = true;
                } else {
                    z = false;
                }
                d.s(z);
                if (w2.d() != 32) {
                    z2 = false;
                }
                d.s(z2);
                return new anid(w, w2);
            case 12:
                Status status = (Status) obj;
                xyo c = ttb.a.c();
                c.H("Scytale resetDataStore completed");
                c.z("status", status);
                c.q();
                twd.b(status);
                return null;
            case 13:
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                ttb.a.q("CryptoV2Provider.get called while Etouffee is unprovisioned");
                throw new twg();
            case 14:
                return ((vbq) obj).m();
            case 15:
                tth.a.r("Skipping missing prekey check due to unexpected error", (aqwb) obj);
                return false;
            case 16:
                if (((typ) obj) != typ.PROVISIONED) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 17:
                return ((vbq) obj).m();
            case 18:
                return ttj.d((typ) obj);
            case 19:
                return pvz.a((ChatMessage) obj);
            default:
                throw new wyz((IllegalStateException) obj);
        }
    }
}
