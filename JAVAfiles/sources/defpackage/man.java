package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class man implements men {
    static final uuf a = uuh.f(uuh.b, "MessageStatusMaxRows", 300);
    public static final /* synthetic */ int b = 0;
    private final xnv c;
    private sxx d;
    private final ykw e;

    public man(xnv xnvVar, ykw ykwVar) {
        this.c = xnvVar;
        this.e = ykwVar;
    }

    public static boolean g(String str) {
        return agkx.ab(str, MessagesTable.c.a.toString());
    }

    @Override // defpackage.men
    public final int a() {
        if (!((Boolean) utw.Y.e()).booleanValue()) {
            return 0;
        }
        final long epochMilli = this.c.f().toEpochMilli();
        final long millis = TimeUnit.DAYS.toMillis(((Integer) utw.Z.e()).intValue());
        final long millis2 = TimeUnit.DAYS.toMillis(((Integer) utw.aa.e()).intValue());
        sxj sxjVar = new sxj(sxl.a);
        sxjVar.w("MessageStatusLoggerImpl#cleanup1");
        long max = Math.max(sxjVar.b().k((agmh) sxl.d.c) - ((Long) a.e()).longValue(), 0L);
        sxh sxhVar = new sxh();
        sxhVar.f("MessageStatusLoggerImpl#cleanup#messagestatus1");
        int i = 11;
        sxhVar.b(new ilg(max, i));
        int d = sxhVar.d();
        sxy d2 = MessagesTable.d();
        d2.w("MessageStatusLoggerImpl#cleanup2");
        d2.e(new lvo(10));
        d2.g(new lvo(i));
        final sxx b2 = d2.b();
        sxh sxhVar2 = new sxh();
        sxhVar2.f("MessageStatusLoggerImpl#cleanup#messagestatus2");
        sxhVar2.b(new Function() { // from class: mal
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo416andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                sxk sxkVar = (sxk) obj;
                int i2 = man.b;
                lvo lvoVar = new lvo(7);
                long j = epochMilli;
                Function[] functionArr = {lvoVar, new mak(j, millis2, 0), new mth(j, millis, b2, 1)};
                sxk[] sxkVarArr = new sxk[3];
                for (int i3 = 0; i3 < 3; i3++) {
                    apply = functionArr[i3].apply(new sxk());
                    sxkVarArr[i3] = (sxk) apply;
                }
                sxkVar.V(sxkVarArr);
                return sxkVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int d3 = d + sxhVar2.d();
        this.e.j("message_status_cleaup_rows_deleted", d3);
        this.e.k("message_status_cleaup_time_millis", this.c.f().toEpochMilli());
        return d3;
    }

    @Override // defpackage.men
    public final meo b() {
        meo meoVar = new meo();
        sxj sxjVar = new sxj(sxl.a);
        sxjVar.w("MessageStatusLoggerImpl#getRowCount");
        meoVar.a = sxjVar.b().i();
        sxj sxjVar2 = new sxj(sxl.a);
        sxjVar2.w("MessageStatusLoggerImpl#getSizeEstimate");
        sxg sxgVar = (sxg) sxjVar2.b().n();
        int i = 0;
        while (true) {
            try {
                sxd sxdVar = (sxd) sxgVar.cM();
                if (sxdVar != null) {
                    i += sxdVar.a().length();
                } else {
                    sxgVar.close();
                    meoVar.b = i;
                    sxj sxjVar3 = new sxj(sxl.a);
                    sxjVar3.w("getEarliestTimestamp");
                    meoVar.c = sxjVar3.b().l((agmh) sxl.d.f);
                    meoVar.d = this.e.e("message_status_cleaup_time_millis", 0L);
                    meoVar.e = this.e.d("message_status_cleaup_rows_deleted", 0);
                    return meoVar;
                }
            } catch (Throwable th) {
                try {
                    sxgVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.men
    public final void c() {
        sxy d = MessagesTable.d();
        d.w("MessageStatusLoggerImpl#init");
        d.d(new lvo(9));
        sxx b2 = d.b();
        this.d = b2;
        b2.E(new mam(this));
    }

    @Override // defpackage.men
    public final void d(MessageIdType messageIdType, qkw qkwVar) {
        String str;
        mem memVar = mem.SEND_UPDATE;
        switch (qkwVar.a) {
            case -1:
                str = "PENDING";
                break;
            case 0:
                str = "SUCCEEDED";
                break;
            case 1:
                str = "AUTO_RETRY";
                break;
            case 2:
                str = "MANUAL_RETRY";
                break;
            case 3:
                str = "NO_RETRY";
                break;
            case 4:
                str = "FALLBACK_TO_XMS";
                break;
            case 5:
                str = "NO_RETRY_NO_FALLBACK";
                break;
            case 6:
                str = "SEND_AGAIN";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        f(messageIdType, memVar, Optional.of(str + ", error: " + qkwVar.b));
    }

    public final void e(MessageIdType messageIdType, int i, Optional optional) {
        String a2;
        if (!((Boolean) utw.Y.e()).booleanValue()) {
            return;
        }
        xyl.h();
        long epochMilli = this.c.f().toEpochMilli();
        sxe a3 = sxl.a();
        if (messageIdType.b()) {
            a2 = null;
        } else {
            a2 = messageIdType.a();
        }
        a3.e(a2);
        a3.g(epochMilli);
        a3.f(i);
        if (optional.isPresent()) {
            a3.d((String) optional.get());
        }
        a3.b();
    }

    public final void f(MessageIdType messageIdType, mem memVar, Optional optional) {
        String a2;
        if (!((Boolean) utw.Y.e()).booleanValue()) {
            return;
        }
        xyl.h();
        long epochMilli = this.c.f().toEpochMilli();
        sxe a3 = sxl.a();
        if (messageIdType.b()) {
            a2 = null;
        } else {
            a2 = messageIdType.a();
        }
        a3.e(a2);
        a3.g(epochMilli);
        a3.c(memVar);
        if (optional.isPresent()) {
            a3.d((String) optional.get());
        }
        a3.b();
    }

    @Override // defpackage.men
    public final byte[] h() {
        Object apply;
        aoza aozaVar = new aoza();
        PrintWriter printWriter = new PrintWriter((OutputStream) aozaVar, true);
        sxj sxjVar = new sxj(sxl.a);
        sxjVar.w("MessageStatusLogger#dump-message_status");
        apply = new lvo(8).apply(sxl.d);
        sxf[] sxfVarArr = (sxf[]) apply;
        int c = a.bp().c();
        Integer.valueOf(c).getClass();
        for (sxf sxfVar : sxfVarArr) {
            if (((Integer) sxl.b.getOrDefault(sxfVar.toString(), -1)).intValue() > c) {
                agnc.t("columnReference.toString()", c);
            }
        }
        sxjVar.m(sxfVarArr);
        sxg sxgVar = (sxg) sxjVar.b().n();
        while (sxgVar.moveToNext()) {
            try {
                printWriter.append((CharSequence) Long.toString(sxgVar.f())).append('\t');
                if (sxgVar.i() != null) {
                    printWriter.append((CharSequence) sxgVar.i());
                }
                printWriter.append('\t').append((CharSequence) Integer.toString(sxgVar.c())).append('\t');
                if (sxgVar.h() != null) {
                    printWriter.append((CharSequence) sxgVar.h());
                }
                printWriter.append('\n');
            } catch (Throwable th) {
                try {
                    sxgVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        sxgVar.close();
        printWriter.flush();
        byte[] H = aozaVar.b().H();
        printWriter.close();
        return advr.x(H, 524288);
    }
}
