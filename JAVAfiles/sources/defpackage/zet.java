package defpackage;

import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.Uri;
import android.system.OsConstants;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.provisioning.config.Configuration;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class zet implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ zet(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v61, types: [armf, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        List historicalProcessExitReasons;
        String processName;
        int reason;
        int status;
        int status2;
        int status3;
        int status4;
        int status5;
        int i = 2;
        switch (this.b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    zeu zeuVar = (zeu) this.a;
                    historicalProcessExitReasons = ((ActivityManager) zeuVar.d.b()).getHistoricalProcessExitReasons(zeuVar.c.getPackageName(), 0, 0);
                    String a = yhx.a(zeuVar.c);
                    Iterator it = historicalProcessExitReasons.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ApplicationExitInfo m = anf$$ExternalSyntheticApiModelOutline0.m(it.next());
                            processName = m.getProcessName();
                            if (TextUtils.equals(processName, a)) {
                                reason = m.getReason();
                                switch (reason) {
                                    case 1:
                                        i = 1;
                                        break;
                                    case 2:
                                        status = m.getStatus();
                                        if (status != OsConstants.SIGILL) {
                                            status2 = m.getStatus();
                                            if (status2 != OsConstants.SIGABRT) {
                                                status3 = m.getStatus();
                                                if (status3 != OsConstants.SIGBUS) {
                                                    status4 = m.getStatus();
                                                    if (status4 != OsConstants.SIGKILL) {
                                                        status5 = m.getStatus();
                                                        if (status5 == OsConstants.SIGSEGV) {
                                                            i = 111;
                                                            break;
                                                        }
                                                    } else {
                                                        i = 109;
                                                        break;
                                                    }
                                                } else {
                                                    i = 107;
                                                    break;
                                                }
                                            } else {
                                                i = 106;
                                                break;
                                            }
                                        } else {
                                            i = 104;
                                            break;
                                        }
                                        break;
                                    case 3:
                                        i = 3;
                                        break;
                                    case 4:
                                        i = 4;
                                        break;
                                    case 5:
                                        i = 5;
                                        break;
                                    case 6:
                                        i = 6;
                                        break;
                                    case 7:
                                        i = 7;
                                        break;
                                    case 8:
                                        i = 8;
                                        break;
                                    case 9:
                                        i = 9;
                                        break;
                                    case 10:
                                        i = 10;
                                        break;
                                    case 11:
                                        i = 11;
                                        break;
                                    case 12:
                                        i = 12;
                                        break;
                                    case 13:
                                        i = 13;
                                        break;
                                    default:
                                        i = 0;
                                        break;
                                }
                                ((alwl) zeu.a.m().h("com/google/android/apps/messaging/startup/ProcessHistoryLogger", "logApplicationExitReasonInternal", 87, "ProcessHistoryLogger.java")).B("%s process exit reason: %d", a, i);
                                ((mbl) zeuVar.e.b()).e("Bugle.Process.Main.ExitReason.Count", i);
                            }
                        }
                    }
                }
                return null;
            case 1:
                zes.a.o("Initializing RCS availability...");
                Object obj2 = this.a;
                akrh e = aktp.e("PhoneAsyncPermissionsStartupTask#initializeRcsAvailability");
                try {
                    ((vrn) ((zes) obj2).b.a()).j();
                    zes.a.o("Done with RCS availability.");
                    e.close();
                    zes.a.o("Done initializing with enabled individual init failures.");
                    return 0;
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 2:
                zbl zblVar = ((zjs) this.a).c;
                ((AtomicReference) zblVar.c).set(akfa.a((zjt) obj, ((xnv) zblVar.b).f()));
                return null;
            case 3:
                zkb zkbVar = (zkb) obj;
                uuf uufVar = zke.a;
                zkbVar.getClass();
                aozy builder = zkbVar.toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                Object obj3 = this.a;
                zkb zkbVar2 = (zkb) builder.b;
                zkbVar2.b |= 32;
                zkbVar2.h = (String) obj3;
                return (zkb) builder.s();
            case 4:
                zkb zkbVar3 = (zkb) obj;
                uuf uufVar2 = zke.a;
                zkbVar3.getClass();
                aozy builder2 = zkbVar3.toBuilder();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                Object obj4 = this.a;
                zkb zkbVar4 = (zkb) builder2.b;
                obj4.getClass();
                zkbVar4.b |= 32;
                zkbVar4.h = (String) obj4;
                return (zkb) builder2.s();
            case 5:
                akfc akfcVar = zmt.a;
                aozy builder3 = ((zmq) obj).toBuilder();
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                Object obj5 = this.a;
                zmq zmqVar = (zmq) builder3.b;
                zmqVar.d = ((zmp) obj5).e;
                zmqVar.b |= 2;
                return (zmq) builder3.s();
            case 6:
                ((zmt) this.a).c(zmt.c);
                return null;
            case 7:
                akfc akfcVar2 = zmt.a;
                aozy builder4 = ((zmq) obj).toBuilder();
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                Object obj6 = this.a;
                zmq zmqVar2 = (zmq) builder4.b;
                zmqVar2.c = ((zmp) obj6).e;
                zmqVar2.b |= 1;
                return (zmq) builder4.s();
            case 8:
                ((zmt) this.a).c(zmt.b);
                return null;
            case 9:
                ParticipantsTable.BindData a2 = ((rsa) obj).a();
                if (a2 == null || a2.v() == null) {
                    return null;
                }
                Object obj7 = this.a;
                Uri v = a2.v();
                zug zugVar = (zug) obj7;
                long longValue = zugVar.h.longValue();
                int i2 = zugVar.i;
                return zugVar.f.a(v, i2, i2, longValue);
            case 10:
                aiut.e(new yar(this.a, (Boolean) obj, 20, null));
                return null;
            case 11:
                ((uhc) ((zxy) this.a).b).a();
                return null;
            case 12:
                ((iew) ((ttj) ((wyp) this.a).e.b()).g.b()).i((String) obj);
                return null;
            case 13:
                ((abbu) ((aalt) this.a).Z.b()).l("Unregistered Google RCS successfully");
                return new Object();
            case 14:
                ((abbu) ((aalt) this.a).Z.b()).l("Failed to unregistered Google RCS");
                xzb.i("BugleNetwork", (aqwb) obj, "Failed to unregistered Google RCS");
                return new Object();
            case 15:
                Iterator it2 = ((Set) obj).iterator();
                while (it2.hasNext()) {
                    ((adnk) ((aalt) this.a).at.b()).u(adom.n((adiv) it2.next()).a, new Configuration());
                }
                return null;
            case 16:
                ((uhc) ((aalt) this.a).X.b()).a();
                return null;
            case 17:
                xze xzeVar = aalt.c;
                ((AlertDialog.Builder) this.a).create().show();
                return null;
            case 18:
                xze xzeVar2 = aalt.c;
                return new AlertDialog.Builder((Context) ((zof) this.a).b).setTitle("Restore Workflow Execution Ids").setMessage((String) obj).setCancelable(true).show();
            case 19:
                Integer num = (Integer) obj;
                abbu abbuVar = (abbu) ((aalt) this.a).Z.b();
                Objects.toString(num);
                abbuVar.l(String.valueOf(num).concat(" groups have been upgraded"));
                return null;
            default:
                Throwable th3 = (Throwable) obj;
                ((alvg) ((alvg) ((alvg) aalt.d.g()).g(th3)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionWriteBackup", (char) 2422, "DebugUtilsImpl.java")).q("Failed to create BackupDb");
                ((abbu) ((aalt) this.a).Z.b()).l("Failed to create BackupDb: ".concat(String.valueOf(th3.getClass().getSimpleName())));
                return null;
        }
    }
}
