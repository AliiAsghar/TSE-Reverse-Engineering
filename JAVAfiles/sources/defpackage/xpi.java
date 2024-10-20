package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xpi {
    public static final akfc a = new akgc("file_transfer_data_service");
    private static final utz f = uuh.e(uuh.b, "file_transfer_progress_timeout_sec", 300);
    public final Map b = new HashMap();
    public final Executor c;
    public final ahiy d;
    public final yyt e;
    private final aneo g;

    public xpi(aneo aneoVar, ahiy ahiyVar, wfh wfhVar) {
        this.c = new anew(aneoVar);
        this.d = ahiyVar;
        this.g = aneoVar;
        this.e = wfhVar.Y(new qds(4));
    }

    public final akul a(MessageIdType messageIdType, xog xogVar) {
        akul ah = aktp.ah(new vri((Object) this, (Object) messageIdType, (Object) xogVar, 12, (char[]) null), this.c);
        this.d.q(ah, a);
        this.e.y(new wxx(messageIdType, 10), "FileTransferDataService::Notify");
        akul.g(this.g.schedule(akto.j(new vri((Object) this, (Object) messageIdType, (Object) xogVar, 13, (char[]) null)), Duration.ofSeconds(((Integer) f.e()).intValue()).getSeconds(), TimeUnit.SECONDS)).k(qiu.b(), andi.a);
        return ah;
    }
}
