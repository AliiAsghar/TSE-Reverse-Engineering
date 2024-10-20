package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import defpackage.aczx;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.albo;
import defpackage.alhr;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.amdy;
import defpackage.amrk;
import defpackage.amrl;
import defpackage.aozs;
import defpackage.apdj;
import defpackage.armf;
import defpackage.mho;
import defpackage.qzh;
import defpackage.ray;
import defpackage.rbk;
import defpackage.rcw;
import defpackage.rjm;
import defpackage.rve;
import defpackage.rys;
import defpackage.uvl;
import defpackage.via;
import defpackage.vjs;
import defpackage.xnv;
import defpackage.xyl;
import defpackage.ydl;
import defpackage.yjr;
import defpackage.yyt;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ProcessFileTransferAction extends Action<Void> {
    public final rjm b;
    public final armf c;
    public final armf d;
    public final xnv e;
    public final mho f;
    public final yjr g;
    public final Optional h;
    public final armf i;
    public final armf j;
    private final rys k;
    private final agnq l;
    private final armf m;
    private final vjs n;
    private final yyt o;
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/action/ProcessFileTransferAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ray(12);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rcw NA();
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface b {
        via eu();
    }

    public ProcessFileTransferAction(rys rysVar, rjm rjmVar, vjs vjsVar, armf armfVar, armf armfVar2, xnv xnvVar, mho mhoVar, yjr yjrVar, agnq agnqVar, Optional optional, yyt yytVar, armf armfVar3, armf armfVar4, armf armfVar5, Event event) {
        super(amdy.PROCESS_FILE_TRANSFER_ACTION);
        this.k = rysVar;
        this.b = rjmVar;
        this.n = vjsVar;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = xnvVar;
        this.f = mhoVar;
        this.g = yjrVar;
        this.l = agnqVar;
        this.h = optional;
        this.o = yytVar;
        this.i = armfVar3;
        this.m = armfVar4;
        this.j = armfVar5;
        if (event instanceof FileTransferEvent) {
            this.u.t("key_rcs_file_transfer_event", event);
        } else {
            xyl.c("ProcessFileTransferAction: unexpected event ".concat(event.toString()));
        }
    }

    public static boolean j(MessageCoreData messageCoreData, long j) {
        if (!aczx.s()) {
            if (j == 11) {
                return false;
            }
        } else {
            int i = (int) j;
            if (i == 11 || i == 201 || i == 202) {
                return false;
            }
        }
        if (messageCoreData.a() < ((Integer) qzh.a.e()).intValue()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ProcessFileTransferAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        final FileTransferEvent fileTransferEvent = (FileTransferEvent) this.u.h("key_rcs_file_transfer_event");
        akrh e = aktp.e("ProcessFileTransferAction.executeAction");
        try {
            final rve a2 = rve.a(fileTransferEvent.a);
            MessageCoreData messageCoreData = (MessageCoreData) ((Optional) this.l.c("ProcessFileTransferAction#processResult", new alhr() { // from class: rcv
                /* JADX WARN: Code restructure failed: missing block: B:50:0x0163, code lost:
                
                    if (r1 != r2.j()) goto L54;
                 */
                @Override // defpackage.alhr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object get() {
                    /*
                        Method dump skipped, instructions count: 833
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.rcv.get():java.lang.Object");
                }
            })).orElse(null);
            if (messageCoreData != null) {
                ConversationIdType z = messageCoreData.z();
                int d = messageCoreData.d();
                if (messageCoreData.cp()) {
                    this.n.h();
                }
                if (messageCoreData.cp()) {
                    l();
                    this.k.c(z, false, 0, d, -1, !messageCoreData.cw());
                }
                String ar = messageCoreData.ar();
                alvw g = a.g();
                g.X(alwp.a, "BugleDataModel");
                alvg alvgVar = (alvg) g;
                alvgVar.X(ydl.p, z);
                alvgVar.X(ydl.b, messageCoreData.B());
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/action/ProcessFileTransferAction", "processResult", 299, "ProcessFileTransferAction.java")).N("process Result. %s %s. eventCode: %d, retryAfter: %s, status: %s, info: %d, autoRetryCounter: %d.", messageCoreData.ai(), albo.ag(ar), Integer.valueOf(fileTransferEvent.h), fileTransferEvent.b, messageCoreData.ay(), Long.valueOf(fileTransferEvent.i), Integer.valueOf(messageCoreData.a()));
                if (!messageCoreData.cO() && !messageCoreData.cl()) {
                    rbk.e(uvl.u(messageCoreData), fileTransferEvent.b, this);
                }
            }
            e.close();
            return null;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessFileTransfer.ExecuteAction.Latency";
    }

    public final void h(MessageCoreData messageCoreData) {
        amrl amrlVar;
        amrk amrkVar;
        if (!this.u.x("key_failed_file_transfer_diagnostics")) {
            amrlVar = amrl.a;
        } else {
            amrlVar = (amrl) ((apdj) this.u.h("key_failed_file_transfer_diagnostics")).a(amrl.a, aozs.a());
        }
        if (!this.u.x("key_failed_file_transfer_details")) {
            amrkVar = amrk.a;
        } else {
            amrkVar = (amrk) ((apdj) this.u.h("key_failed_file_transfer_details")).a(amrk.a, aozs.a());
        }
        this.o.D(messageCoreData, amrlVar, amrkVar, Optional.empty());
    }

    public final void l() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessFileTransferAction(rys rysVar, rjm rjmVar, vjs vjsVar, armf armfVar, armf armfVar2, xnv xnvVar, mho mhoVar, yjr yjrVar, agnq agnqVar, Optional optional, armf armfVar3, yyt yytVar, armf armfVar4, armf armfVar5, Parcel parcel) {
        super(parcel, amdy.PROCESS_FILE_TRANSFER_ACTION);
        this.k = rysVar;
        this.b = rjmVar;
        this.n = vjsVar;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = xnvVar;
        this.f = mhoVar;
        this.g = yjrVar;
        this.l = agnqVar;
        this.h = optional;
        this.i = armfVar3;
        this.o = yytVar;
        this.m = armfVar4;
        this.j = armfVar5;
    }
}
