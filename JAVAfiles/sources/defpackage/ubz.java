package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.uuh;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ubz implements alhr {
    private final /* synthetic */ int a;

    public /* synthetic */ ubz(int i) {
        this.a = i;
    }

    @Override // defpackage.alhr
    public final Object get() {
        amdr amdlVar;
        int i = 0;
        int i2 = 1;
        switch (this.a) {
            case 0:
                alvi alviVar = uci.a;
                return null;
            case 1:
                alvi alviVar2 = uci.a;
                return null;
            case 2:
                return ucn.a(null, null);
            case 3:
                xze xzeVar = udp.a;
                return uuh.e(uuh.b, "DatabaseWrapperCursorHandlerRetryIterations", 20);
            case 4:
                xze xzeVar2 = udp.a;
                return uuh.f(uuh.b, "DatabaseWrapperCursorHandlerBackoffMillis", 50L);
            case 5:
                uuf uufVar = ugu.a;
                sxy d = MessagesTable.d();
                d.w("TableChangeObserver-messages");
                d.d(new ugo(2));
                return d.b();
            case 6:
                uuf uufVar2 = ugu.a;
                snf e = sni.e();
                e.w("TableChangeObserver-conversations");
                e.e(new ugo(i));
                return e.b();
            case 7:
                uuf uufVar3 = ugu.a;
                taz e2 = ParticipantsTable.e();
                e2.w("TableChangeObserver-participants");
                e2.d(new ugo(3));
                return e2.b();
            case 8:
                uuf uufVar4 = ugu.a;
                stj a = stl.a();
                a.w("TableChangeObserver-message_annotations");
                a.c(new ugo(i2));
                return a.b();
            case 9:
                return Optional.empty();
            case 10:
                utz utzVar = utw.a;
                return aouz.a.toByteArray();
            case 11:
                return ((uuh.a) yyb.aL(uuh.a.class)).Qw();
            case 12:
                return yyb.bb("DittoUpload", ((Integer) vbm.c.e()).intValue(), 1);
            case 13:
                return yyb.bb("DittoDownload", ((Integer) vbm.d.e()).intValue(), 1);
            case 14:
                alvi alviVar3 = vfa.a;
                return Pattern.compile((String) vbh.d.e());
            case 15:
                return Optional.empty();
            case 16:
                amdn amdnVar = new amdn(1000L, 2.0d, 10);
                long j = wuh.a;
                if (j == 0) {
                    amdlVar = new amdm();
                } else {
                    amdlVar = new amdl(j);
                }
                return new amdo(amdnVar, amdlVar);
            case 17:
                int i3 = wzn.a;
                return uuh.n(uuh.b, "enable_forward_sync_management_redesign", true);
            case 18:
                uuf uufVar5 = xct.a;
                return uuh.b("bypass_message_queueing_v2", false);
            case 19:
                return new ArrayList();
            default:
                String str = (String) xda.a.e();
                alob alobVar = new alob();
                try {
                    for (String str2 : xdd.e.a(str)) {
                        str2.getClass();
                        alobVar.h(new wfh(str2));
                    }
                } catch (Exception e3) {
                    alvw i4 = xdd.a.i();
                    i4.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i4).g(e3).h("com/google/android/apps/messaging/shared/suggestions/SuggestionTypeCombinationsConfig", "parseConfigString", 101, "SuggestionTypeCombinationsConfig.kt")).t("Error while parsing config string %s", str);
                }
                alog g = alobVar.g();
                g.getClass();
                return g;
        }
    }
}
