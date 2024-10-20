package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.apxm;
import java.io.RandomAccessFile;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class akec {
    public akec() {
    }

    public static void A(ListenableFuture listenableFuture, String str) {
        albo.bR(listenableFuture, akto.h(new xch(str, 6)), andi.a);
    }

    public static ListenableFuture B(List list) {
        return aktp.aq(list).n(new akdj(list, 6), andi.a);
    }

    public static akja C(akie akieVar, aozy aozyVar, atqq atqqVar, String str) {
        aozb aozbVar;
        akieVar.getClass();
        if (atqqVar.h(str).b) {
            String str2 = akieVar.d;
            str2.getClass();
            if (str2.length() != 0) {
                String str3 = akieVar.d;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                ahtt ahttVar = (ahtt) aozyVar.b;
                ahtt ahttVar2 = ahtt.a;
                str3.getClass();
                ahttVar.b |= 1;
                ahttVar.c = str3;
            }
        } else {
            String str4 = akieVar.d;
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            ahtt ahttVar3 = (ahtt) aozyVar.b;
            ahtt ahttVar4 = ahtt.a;
            str4.getClass();
            ahttVar3.b |= 1;
            ahttVar3.c = str4;
        }
        String str5 = akieVar.c;
        str5.getClass();
        if ((akieVar.b & 4) != 0) {
            aozbVar = akieVar.e;
        } else {
            aozbVar = null;
        }
        long j = akieVar.i;
        apag s = aozyVar.s();
        s.getClass();
        return new akja(str5, aozbVar, j, (ahtt) s);
    }

    public static ahmn D(Context context, agcp agcpVar) {
        context.getClass();
        akyr akyrVar = akkp.i;
        String a = aiep.a(context);
        a.getClass();
        return agcpVar.A("StartupAfterPackageReplacedImplDatabase_".concat(new arus("[^A-Za-z0-9\\-_:]").a(a, "_")), akkp.i);
    }

    public static apuv E(boolean z) {
        return new apuv(new akig(z), 2);
    }

    public static apuv F(double d) {
        return new apuv(new akih(d), 3);
    }

    public static apuv G(long j) {
        return new apuv(new akii(j), 1);
    }

    public static apuv H(arqg arqgVar, apbt apbtVar) {
        apbtVar.getClass();
        return new apuv(arqgVar, 6, apbtVar);
    }

    public static apuv I(String str) {
        return new apuv(new aruc(str, 1), 4);
    }

    public static /* synthetic */ amva J(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amva) s;
    }

    public static void K(boolean z, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amva amvaVar = (amva) aozyVar.b;
        amva amvaVar2 = amva.a;
        amvaVar.b |= 2;
        amvaVar.d = z;
    }

    public static void L(boolean z, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amva amvaVar = (amva) aozyVar.b;
        amva amvaVar2 = amva.a;
        amvaVar.b |= 8;
        amvaVar.f = z;
    }

    public static void M(boolean z, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amva amvaVar = (amva) aozyVar.b;
        amva amvaVar2 = amva.a;
        amvaVar.b |= 4;
        amvaVar.e = z;
    }

    public static void N(String str, aozy aozyVar) {
        str.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amva amvaVar = (amva) aozyVar.b;
        amva amvaVar2 = amva.a;
        amvaVar.b |= 1;
        amvaVar.c = str;
    }

    public static /* synthetic */ amox O(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amox) s;
    }

    public static String P(int i) {
        return Integer.toString(a.M(i));
    }

    public static /* synthetic */ amut Q(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amut) s;
    }

    public static void R(amus amusVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amut amutVar = (amut) aozyVar.b;
        amut amutVar2 = amut.a;
        amutVar.g = amusVar;
        amutVar.b |= 4;
    }

    public static void S(aozb aozbVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amut amutVar = (amut) aozyVar.b;
        amut amutVar2 = amut.a;
        amutVar.b |= 2;
        amutVar.f = aozbVar;
    }

    public static void T(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amut amutVar = (amut) aozyVar.b;
        amut amutVar2 = amut.a;
        amutVar.e = i - 1;
        amutVar.b |= 1;
    }

    public static /* synthetic */ amos U(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amos) s;
    }

    public static void V(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amos amosVar = (amos) aozyVar.b;
        amos amosVar2 = amos.a;
        amosVar.e = i - 1;
        amosVar.b |= 4;
    }

    public static /* synthetic */ amqj W(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amqj) s;
    }

    public static void X(amqh amqhVar, aozy aozyVar) {
        amqhVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amqj amqjVar = (amqj) aozyVar.b;
        amqj amqjVar2 = amqj.a;
        amqjVar.c = amqhVar.v;
        amqjVar.b |= 1;
    }

    public static void Y(amqi amqiVar, aozy aozyVar) {
        amqiVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amqj amqjVar = (amqj) aozyVar.b;
        amqj amqjVar2 = amqj.a;
        amqjVar.d = amqiVar.e;
        amqjVar.b |= 2;
    }

    public static /* synthetic */ amqg Z(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amqg) s;
    }

    public static ascv a(asai asaiVar, arwe arweVar, arqv arqvVar) {
        ascd a = ascy.a(new akej());
        arro.s(arweVar, aktp.a(arpj.a), arwf.d, new akef(null, asaiVar, arqvVar, a));
        return new ascf(a);
    }

    public static void aA(amuk amukVar, aozy aozyVar) {
        amukVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amjf amjfVar = (amjf) aozyVar.b;
        amjf amjfVar2 = amjf.a;
        amjfVar.c = amukVar.e;
        amjfVar.b |= 1;
    }

    public static void aB(boolean z, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amjf amjfVar = (amjf) aozyVar.b;
        amjf amjfVar2 = amjf.a;
        amjfVar.b |= 2;
        amjfVar.d = z;
    }

    public static int aC(int i) {
        return i - 2;
    }

    public static /* synthetic */ String aD(int i) {
        if (i != 2) {
            return "TACHYON_REGISTRATION_TYPE_PHONE_NUMBER";
        }
        return "TACHYON_REGISTRATION_TYPE_DITTO";
    }

    public static /* synthetic */ String aE(int i) {
        if (i != 1) {
            return "INCREMENTAL_SYNC";
        }
        return "FULL_SYNC";
    }

    public static String aF(int i) {
        return Integer.toString(a.M(i));
    }

    public static int aG(int i) {
        if (i != 0) {
            if (i != 20) {
                if (i != 30) {
                    if (i != 43) {
                        if (i != 46) {
                            if (i != 50) {
                                if (i == 10) {
                                    return 11;
                                }
                                if (i != 11) {
                                    if (i == 40) {
                                        return 41;
                                    }
                                    if (i != 41) {
                                        return 0;
                                    }
                                    return 42;
                                }
                                return 12;
                            }
                            return 51;
                        }
                        return 47;
                    }
                    return 44;
                }
                return 31;
            }
            return 21;
        }
        return 1;
    }

    public static int aH(int i) {
        if (i != 0) {
            if (i != 10) {
                if (i != 20) {
                    if (i != 30) {
                        if (i != 40) {
                            if (i != 50) {
                                if (i != 60) {
                                    return 0;
                                }
                                return 61;
                            }
                            return 51;
                        }
                        return 41;
                    }
                    return 31;
                }
                return 21;
            }
            return 11;
        }
        return 1;
    }

    public static String aI(int i) {
        return Integer.toString(a.M(i));
    }

    public static /* synthetic */ String aJ(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN_BUGLE_MESSAGE_TYPE";
            case 2:
                return "SMS";
            case 3:
                return "MMS";
            case 4:
                return "RCS";
            case 5:
                return "CLOUD_SYNC";
            case 6:
                return "IMDN_DELIVERED";
            case 7:
                return "IMDN_DISPLAYED";
            case 8:
                return "IMDN_FALLBACK";
            case 9:
                return "RCS_GENERIC";
            case 10:
                return "FTD";
            case 11:
                return "FT_E2EE_LEGACY";
            case 12:
                return "FT_E2EE_XML";
            case 13:
                return "LIGHTER_MESSAGE";
            case 14:
                return "RBM_SPAM_REPORT";
            default:
                return "SATELLITE";
        }
    }

    public static /* synthetic */ String aK(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN_BUGLE_MESSAGE_STATUS";
            case 2:
                return "SENT";
            case 3:
                return "RECEIVED";
            case 4:
                return "DOWNLOADED";
            case 5:
                return "DELETED";
            case 6:
                return "SENT_FAILURE";
            case 7:
                return "DOWNLOADED_FAILURE";
            case 8:
                return "NEW_SENDING";
            case 9:
                return "READ";
            case 10:
                return "DELIVERED";
            case 11:
                return "CREATED";
            case 12:
                return "FALL_BACK_INITIATED";
            case 13:
                return "MESSAGE_ID_CREATED";
            case 14:
                return "RECEIVED_FROM_BLOCKED_PARTICIPANT";
            case 15:
                return "DOWNLOAD_START";
            case 16:
                return "RECEIVE_FAILURE";
            case 17:
                return "TICKLE_SENT";
            case 18:
                return "RCS_DELIVERY_FAILURE";
            case 19:
                return "UPLOAD_STARTED";
            case 20:
                return "UPLOAD_SUCCEEDED";
            case 21:
                return "UPLOAD_FAILED";
            case 22:
                return "TEMP_SENT_FAILURE";
            case 23:
                return "UNKNOWN_CONTENT_TYPE";
            case 24:
                return "E2EE_DECRYPTION_FAILED";
            case 25:
                return "STUCK_IN_SENDING";
            case 26:
                return "E2EE_ENCRYPTION_FAILED";
            case 27:
                return "RECIPIENT_LOST_ENCRYPTION_FALLBACK";
            case 28:
                return "DOWNLOAD_RESUME_FAILURE";
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return "CHAT_MESSAGE_SEND_INITIATED";
            case 30:
                return "SENT_VISIBLE";
            case 31:
                return "DELIVERED_VISIBLE";
            case 32:
                return "RECEIVING";
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                return "DOWNLOADED_VISIBLE";
            default:
                return "DOWNLOADED_THUMBNAIL";
        }
    }

    public static int aL(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                return 34;
            default:
                return 0;
        }
    }

    public static int aM(int i) {
        if (i != 0) {
            if (i != 100) {
                switch (i) {
                    case 2:
                        return 3;
                    case 3:
                        return 4;
                    case 4:
                        return 5;
                    case 5:
                        return 6;
                    case 6:
                        return 7;
                    case 7:
                        return 8;
                    case 8:
                        return 9;
                    case 9:
                        return 10;
                    case 10:
                        return 11;
                    case 11:
                        return 12;
                    case 12:
                        return 13;
                    case 13:
                        return 14;
                    case 14:
                        return 15;
                    case 15:
                        return 16;
                    case 16:
                        return 17;
                    case 17:
                        return 18;
                    case 18:
                        return 19;
                    case 19:
                        return 20;
                    case 20:
                        return 21;
                    case 21:
                        return 22;
                    case 22:
                        return 23;
                    case 23:
                        return 24;
                    case 24:
                        return 25;
                    case 25:
                        return 26;
                    case 26:
                        return 27;
                    case 27:
                        return 28;
                    case 28:
                        return 29;
                    case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                        return 30;
                    case 30:
                        return 31;
                    case 31:
                        return 32;
                    case 32:
                        return 33;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                        return 34;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                        return 35;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                        return 36;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                        return 37;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                        return 38;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                        return 39;
                    case 39:
                        return 40;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                        return 41;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                        return 42;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                        return 43;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                        return 44;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                        return 45;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                        return 46;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                        return 47;
                    case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                        return 48;
                    case 48:
                        return 49;
                    case 49:
                        return 50;
                    case 50:
                        return 51;
                    case 51:
                        return 52;
                    case 52:
                        return 53;
                    case 53:
                        return 54;
                    case 54:
                        return 55;
                    default:
                        switch (i) {
                            case 81:
                                return 82;
                            case 82:
                                return 83;
                            case 83:
                                return 84;
                            default:
                                return 0;
                        }
                }
            }
            return 101;
        }
        return 1;
    }

    public static /* synthetic */ amgu aN(amgl amglVar) {
        apag s = amglVar.s();
        s.getClass();
        return (amgu) s;
    }

    public static void aO(long j, amgl amglVar) {
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amgu amguVar2 = amgu.a;
        amguVar.b |= 1073741824;
        amguVar.G = j;
    }

    public static void aP(long j, amgl amglVar) {
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amgu amguVar2 = amgu.a;
        amguVar.b |= 128;
        amguVar.n = j;
    }

    public static void aQ(amxb amxbVar, amgl amglVar) {
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amgu amguVar2 = amgu.a;
        amguVar.O = amxbVar;
        amguVar.c |= 1024;
    }

    public static void aR(String str, amgl amglVar) {
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amgu amguVar2 = amgu.a;
        amguVar.b |= Integer.MIN_VALUE;
        amguVar.H = str;
    }

    public static void aS(amxo amxoVar, amgl amglVar) {
        amxoVar.getClass();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amgu amguVar2 = amgu.a;
        amguVar.aa = amxoVar.h;
        amguVar.c |= 2097152;
    }

    public static void aT(int i, amgl amglVar) {
        if (i != 0) {
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar = (amgu) amglVar.b;
            amgu amguVar2 = amgu.a;
            amguVar.h = i - 1;
            amguVar.b |= 2;
            return;
        }
        throw null;
    }

    public static void aU(int i, amgl amglVar) {
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amgu amguVar2 = amgu.a;
        amguVar.g = i - 1;
        amguVar.b |= 1;
    }

    public static /* synthetic */ ahlp aV(aozy aozyVar) {
        aozyVar.getClass();
        return new ahlp(aozyVar);
    }

    public static ListenableFuture aW(akda akdaVar, String str, gso gsoVar, kkc kkcVar) {
        return akdaVar.d(str, gsoVar, Collections.singletonList(kkcVar));
    }

    private static Context aX(Context context, Class... clsArr) {
        loop0: while (context instanceof ContextWrapper) {
            for (Class cls : clsArr) {
                if (cls.isInstance(context)) {
                    break loop0;
                }
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static void aa(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amqg amqgVar = (amqg) aozyVar.b;
        amqg amqgVar2 = amqg.a;
        amqgVar.b |= 4;
        amqgVar.i = i;
    }

    public static void ab(amqj amqjVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amqg amqgVar = (amqg) aozyVar.b;
        amqg amqgVar2 = amqg.a;
        amqgVar.g = amqjVar;
        amqgVar.b |= 1;
    }

    public static void ac(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amqg amqgVar = (amqg) aozyVar.b;
        amqg amqgVar2 = amqg.a;
        amqgVar.b |= 2;
        amqgVar.h = i;
    }

    public static /* synthetic */ amxp ad(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amxp) s;
    }

    public static void ae(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amxp amxpVar = (amxp) aozyVar.b;
        amxp amxpVar2 = amxp.a;
        amxpVar.c = i - 1;
        amxpVar.b |= 1;
    }

    public static /* synthetic */ ampy af(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (ampy) s;
    }

    public static void ag(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ampy ampyVar = (ampy) aozyVar.b;
        ampy ampyVar2 = ampy.a;
        ampyVar.i = i - 1;
        ampyVar.b |= 64;
    }

    public static void ah(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ampy ampyVar = (ampy) aozyVar.b;
        ampy ampyVar2 = ampy.a;
        ampyVar.c = i - 1;
        ampyVar.b |= 1;
    }

    public static String ai() {
        return Integer.toString(a.M(2));
    }

    public static String aj(int i) {
        return Integer.toString(a.M(i));
    }

    public static /* synthetic */ String ak(int i) {
        switch (i) {
            case 1:
                return "FILE_TRANSFER_FAILURE_REASON_UNKNOWN";
            case 2:
                return "FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED";
            case 3:
                return "FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY";
            case 4:
                return "FILE_TRANSFER_FAILURE_REASON_WRITING_TO_FILE_FAILED";
            case 5:
                return "FILE_TRANSFER_FAILURE_REASON_MESSAGE_NOT_FOUND";
            case 6:
                return "FILE_TRANSFER_FAILURE_REASON_INVALID_MESSAGE";
            case 7:
                return "FILE_TRANSFER_FAILURE_REASON_UNEXPECTED_CANCELLATION";
            case 8:
                return "FILE_TRANSFER_FAILURE_REASON_MAX_REDIRECTS_REACHED";
            case 9:
                return "FILE_TRANSFER_FAILURE_REASON_CLOSING_THE_FILE_FAILED";
            case 10:
                return "FILE_TRANSFER_FAILURE_REASON_OPENING_THE_FILE_FAILED";
            case 11:
                return "FILE_TRANSFER_FAILURE_REASON_FAILED_TO_PARSE_XML";
            case 12:
                return "FILE_TRANSFER_FAILURE_REASON_TACHYON_TOKEN_FAILURE";
            case 13:
                return "FILE_TRANSFER_FAILURE_REASON_INVALID_RCS_CONFIGURATION";
            case 14:
                return "FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_HTTP_RESPONSE";
            case 15:
                return "FILE_TRANSFER_FAILURE_REASON_TRANSFER_EXCEPTION";
            case 16:
                return "FILE_TRANSFER_FAILURE_REASON_FAILED_TO_PREPARE_FILE";
            case 17:
                return "FILE_TRANSFER_FAILURE_REASON_FAILED_TO_GET_ACTIVE_TRANSPORT";
            case 18:
                return "FILE_TRANSFER_FAILURE_REASON_FAILED_TO_GET_FILE_SIZE";
            case 19:
                return "FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_THUMBNAIL_INFO_IN_DB";
            case 20:
                return "FILE_TRANSFER_FAILURE_REASON_MISSING_THUMBNAIL";
            case 21:
                return "FILE_TRANSFER_FAILURE_REASON_FILE_NOT_FOUND_WHILE_TRYING_TO_DECRYPT";
            default:
                return "FILE_TRANSFER_FAILURE_REASON_FAILED_TO_INSERT_OR_UPDATE_FILE_TRANSFER_ENTRY_IN_DB";
        }
    }

    public static /* synthetic */ amoh al(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amoh) s;
    }

    public static /* synthetic */ amog am(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amog) s;
    }

    public static void an(aozb aozbVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amog amogVar = (amog) aozyVar.b;
        amog amogVar2 = amog.a;
        amogVar.b |= 2;
        amogVar.f = aozbVar;
    }

    public static void ao(aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amog amogVar = (amog) aozyVar.b;
        amog amogVar2 = amog.a;
        amogVar.e = 1;
        amogVar.b = 1 | amogVar.b;
    }

    public static /* synthetic */ String ap(int i) {
        if (i != 1) {
            if (i != 2) {
                return "null";
            }
            return "VISIBILITY_HIDDEN";
        }
        return "VISIBILITY_VISIBLE";
    }

    public static /* synthetic */ amnd aq(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amnd) s;
    }

    public static void ar(amyj amyjVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amnd amndVar = (amnd) aozyVar.b;
        amnd amndVar2 = amnd.a;
        amndVar.c = amyjVar;
        amndVar.b |= 1;
    }

    public static void as(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amnd amndVar = (amnd) aozyVar.b;
        amnd amndVar2 = amnd.a;
        amndVar.f = a.aq(i);
        amndVar.b |= 8;
    }

    public static void at(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amnd amndVar = (amnd) aozyVar.b;
        amnd amndVar2 = amnd.a;
        amndVar.d = a.au(i);
        amndVar.b |= 2;
    }

    public static void au(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amnd amndVar = (amnd) aozyVar.b;
        amnd amndVar2 = amnd.a;
        amndVar.e = a.aq(i);
        amndVar.b |= 4;
    }

    public static /* synthetic */ amly av(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amly) s;
    }

    public static void aw(amva amvaVar, aozy aozyVar) {
        amvaVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amly amlyVar = (amly) aozyVar.b;
        amly amlyVar2 = amly.a;
        amlyVar.j = amvaVar;
        amlyVar.b |= 256;
    }

    public static void ax(amlw amlwVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amly amlyVar = (amly) aozyVar.b;
        amly amlyVar2 = amly.a;
        amlyVar.c = amlwVar.U;
        amlyVar.b |= 1;
    }

    public static void ay(amlx amlxVar, aozy aozyVar) {
        amlxVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amly amlyVar = (amly) aozyVar.b;
        amly amlyVar2 = amly.a;
        amlyVar.d = amlxVar.t;
        amlyVar.b |= 4;
    }

    public static /* synthetic */ amjf az(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (amjf) s;
    }

    public static ListenableFuture b(ListenableFuture listenableFuture) {
        return aktp.Y(listenableFuture, new ajwz(19), andi.a);
    }

    public static ListenableFuture c() {
        return albo.bH(new UnsupportedOperationException("A NoAccountWorker or AccountWorker used by a TikTokWorkSpec with setExpedited() must override getForegroundInfoAsync() in order to support API levels < 31."));
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0009, code lost:
    
        if (r2.moveToFirst() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        r0.add(r3.a(new defpackage.akco(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2.moveToNext() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        return defpackage.alzz.aZ(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.alog d(android.database.Cursor r2, defpackage.arqr r3) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r2.moveToFirst()
            if (r1 == 0) goto L1d
        Lb:
            akco r1 = new akco
            r1.<init>(r2)
            java.lang.Object r1 = r3.a(r1)
            r0.add(r1)
            boolean r1 = r2.moveToNext()
            if (r1 != 0) goto Lb
        L1d:
            alog r2 = defpackage.alzz.aZ(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akec.d(android.database.Cursor, arqr):alog");
    }

    public static Object e(arpi arpiVar, arqr arqrVar, arpe arpeVar) {
        return arwi.d(new albu(arpiVar, arqrVar, (arpe) null, 1), arpeVar);
    }

    public static ListenableFuture f(ListenableFuture listenableFuture, Callable callable, Executor executor) {
        anel anelVar = new anel(callable);
        listenableFuture.c(anelVar, executor);
        g(listenableFuture, anelVar);
        return anelVar;
    }

    public static void g(ListenableFuture listenableFuture, ListenableFuture listenableFuture2) {
        listenableFuture2.c(new ajnt(listenableFuture2, listenableFuture, 10, (byte[]) null), andi.a);
    }

    public static String h(Map map, akjc akjcVar) {
        String a = akjcVar.a();
        if (!arsd.O(a, "#")) {
            String str = (String) map.get(a);
            if (str != null) {
                return a.co(str, a, "#");
            }
            return a;
        }
        throw new IllegalStateException("Subpackages should be provided without their base package: ".concat(a));
    }

    public static /* synthetic */ String i(Map map, akjd akjdVar) {
        String a = akjdVar.a();
        if (!arsd.O(a, "#")) {
            String str = (String) map.get(a);
            if (str != null) {
                return a.co(str, a, "#");
            }
            return a;
        }
        throw new IllegalStateException("Subpackages should be provided without their base package: ".concat(String.valueOf(a)));
    }

    public static int j(int i) {
        switch (i) {
            case 0:
                return 7;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 0;
        }
    }

    public static /* synthetic */ akie k(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (akie) s;
    }

    public static void l(Throwable th) {
        throw new akgt(th);
    }

    public static Bundle m(cg cgVar) {
        Bundle bundle = cgVar.m;
        if (bundle == null) {
            return new Bundle();
        }
        return bundle;
    }

    public static boolean n(Context context) {
        if (((Boolean) ((aklu) w(context, aklu.class)).hK().d(false)).booleanValue()) {
            return false;
        }
        return true;
    }

    public static Context o(View view) {
        if (view.getParent() instanceof View) {
            return aX(((View) view.getParent()).getContext(), apxm.a.class, Activity.class);
        }
        return null;
    }

    public static boolean p(Context context) {
        Context aX = aX(context, apxm.a.class);
        if (aX instanceof apxm.a) {
            apxm.a aVar = (apxm.a) aX;
            if (aVar.a != null && aVar.a().s) {
                return true;
            }
        }
        return false;
    }

    public static Locale q(cg cgVar) {
        Bundle bundle = cgVar.m;
        if (bundle == null) {
            return null;
        }
        return (Locale) bundle.getSerializable("com.google.apps.tiktok.inject.peer.EXTRA_LOCALE");
    }

    public static long r(long j) {
        return Math.max(0L, System.currentTimeMillis() - Math.max(0L, SystemClock.elapsedRealtime() - j));
    }

    public static long s() {
        long startElapsedRealtime;
        algw a = ahqg.a();
        if (!a.f()) {
            startElapsedRealtime = Process.getStartElapsedRealtime();
            return startElapsedRealtime;
        }
        return ((Long) a.b()).longValue();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Set, java.lang.Object] */
    public static eov t(cg cgVar, eov eovVar) {
        akkz akkzVar = (akkz) aovp.m(cgVar, akkz.class);
        ansy t = akkzVar.t();
        return new akky(cgVar, ((apwx) aovp.m(akkzVar.i().a, apwx.class)).S().q(eovVar), t.a, (ksa) t.b);
    }

    public static String u(String str) {
        if (str == null) {
            return "103243289";
        }
        return "103243289_".concat(new arus("[^A-Za-z0-9\\-_:]").a(str, "_"));
    }

    public static void v(RandomAccessFile randomAccessFile, int i) {
        randomAccessFile.writeInt(i);
        randomAccessFile.seek(0L);
    }

    public static Object w(Context context, Class cls) {
        Object applicationContext = context.getApplicationContext();
        if (applicationContext instanceof apxq) {
            try {
                return cls.cast(((apxq) applicationContext).aS());
            } catch (ClassCastException e) {
                throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e);
            }
        }
        throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(String.valueOf(applicationContext.getClass()))));
    }

    public static Object x(Context context, Class cls, ajwt ajwtVar) {
        try {
            return cls.cast(((akki) w(context.getApplicationContext(), akki.class)).QB().d(ajwtVar));
        } catch (ClassCastException e) {
            throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonAccountEntryPoint?", e);
        }
    }

    public static boolean y(Intent intent, Context context) {
        if (intent.getPackage() != null && intent.getPackage().equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    public static Object z(Object obj) {
        albo.U(obj instanceof akkh, "Given class does not have a peer");
        return ((akkh) obj).E();
    }

    public akec(byte[] bArr) {
    }

    public akec(byte[] bArr, byte[] bArr2) {
        this();
    }
}
