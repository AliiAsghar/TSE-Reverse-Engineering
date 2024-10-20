package defpackage;

import android.os.Bundle;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xbr extends arpw implements arqv {
    int a;
    final /* synthetic */ xbs b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbr(xbs xbsVar, int i, arpe arpeVar) {
        super(2, arpeVar);
        this.b = xbsVar;
        this.c = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xbr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Bundle bundle;
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            xbs xbsVar = this.b;
            int i2 = this.c;
            this.a = 1;
            obj = xbsVar.a(i2, this);
            if (obj == arplVar) {
                return arplVar;
            }
        }
        aouc aoucVar = (aouc) obj;
        int i3 = xbs.d;
        if (aoucVar == null) {
            bundle = Bundle.EMPTY;
            bundle.getClass();
        } else {
            Bundle bundle2 = new Bundle();
            if ((aoucVar.b & 1) != 0) {
                bundle2.putBoolean("enabledMMS", aoucVar.d);
            }
            if ((aoucVar.b & 2) != 0) {
                bundle2.putBoolean("enableGroupMms", aoucVar.e);
            }
            if ((aoucVar.b & 4) != 0) {
                bundle2.putBoolean("groupChatDefaultsToMMS", aoucVar.f);
            }
            if ((aoucVar.b & 8) != 0) {
                bundle2.putString("httpParams", aoucVar.g);
            }
            if ((aoucVar.b & 16) != 0) {
                bundle2.putString("spamForwardingNumber", aoucVar.h);
            }
            if ((aoucVar.b & 32) != 0) {
                bundle2.putBoolean("enableMultipartSMS", aoucVar.i);
            }
            if ((aoucVar.b & 64) != 0) {
                bundle2.putInt("smsToMmsTextThreshold", aoucVar.j);
            }
            if ((aoucVar.b & 128) != 0) {
                bundle2.putBoolean("enabledTransID", aoucVar.k);
            }
            if ((aoucVar.b & 256) != 0) {
                bundle2.putBoolean("allowEditingSmscAddress", aoucVar.l);
            }
            if ((aoucVar.b & 512) != 0) {
                bundle2.putInt("maxMessageSize", aoucVar.m);
            }
            if ((aoucVar.b & 1024) != 0) {
                bundle2.putInt("maxImageHeight", aoucVar.n);
            }
            if ((aoucVar.b & 2048) != 0) {
                bundle2.putInt("maxImageWidth", aoucVar.o);
            }
            if ((aoucVar.b & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) != 0) {
                bundle2.putString("uaProfTagName", aoucVar.F);
            }
            if ((aoucVar.b & 536870912) != 0) {
                bundle2.putBoolean("supportMmsContentDisposition", aoucVar.G);
            }
            if ((aoucVar.b & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS) != 0) {
                bundle2.putBoolean("supportHttpCharsetHeader", aoucVar.E);
            }
            if ((aoucVar.b & 4194304) != 0) {
                aozn aoznVar = aoucVar.z;
                if (aoznVar == null) {
                    aoznVar = aozn.a;
                }
                bundle2.putInt("httpSocketTimeout", (int) aoznVar.b);
            }
            if ((aoucVar.c & 512) != 0) {
                bundle2.putBoolean("useCustomUserAgent", aoucVar.S);
            }
            if ((aoucVar.b & 1073741824) != 0) {
                bundle2.putBoolean("supportMmsPriority", aoucVar.H);
            }
            if ((aoucVar.b & 2097152) != 0) {
                bundle2.putBoolean("enabledNotifyWapMMSC", aoucVar.y);
            }
            if ((aoucVar.b & VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING) != 0) {
                bundle2.putInt("recipientLimit", aoucVar.C);
            }
            if ((aoucVar.b & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) != 0) {
                bundle2.putString("uaProfTagName", aoucVar.F);
            }
            if ((aoucVar.b & 16777216) != 0) {
                bundle2.putString("naiSuffix", aoucVar.B);
            }
            if ((aoucVar.b & 16384) != 0) {
                bundle2.putBoolean("aliasEnabled", aoucVar.r);
            }
            if ((aoucVar.b & 32768) != 0) {
                bundle2.putInt("aliasMinChars", aoucVar.s);
            }
            if ((aoucVar.b & 65536) != 0) {
                bundle2.putInt("aliasMaxChars", aoucVar.t);
            }
            if ((aoucVar.c & 4) != 0) {
                bundle2.putBoolean("sendMultipartSmsAsSeparateMessages", aoucVar.L);
            }
            if ((aoucVar.c & 256) != 0) {
                bundle2.putBoolean("smsUsesSimpleCharactersOnly", aoucVar.R);
            }
            if ((aoucVar.c & 32) != 0) {
                bundle2.putBoolean("smsEncodingChangeable", aoucVar.O);
            }
            if ((aoucVar.c & 128) != 0) {
                bundle2.putInt("smsToMmsTextLengthThreshold", aoucVar.Q);
            }
            if ((aoucVar.b & 1048576) != 0) {
                bundle2.putString("emailGatewayNumber", String.valueOf(aoucVar.x));
            }
            if ((aoucVar.b & 4096) != 0) {
                bundle2.putBoolean("enableWapPushSI", aoucVar.p);
            }
            if ((aoucVar.b & 8192) != 0) {
                bundle2.putBoolean("allowEnablingWapPushSI", aoucVar.q);
            }
            if ((aoucVar.b & 262144) != 0) {
                bundle2.putBoolean("mms_auto_retrieve_enabled_bool", aoucVar.v);
            }
            if ((aoucVar.b & 131072) != 0) {
                bundle2.putBoolean("allowChangingMmsRoamingAutoRetrieve", aoucVar.u);
            }
            if ((aoucVar.b & VCardConfig.FLAG_APPEND_TYPE_PARAM) != 0) {
                bundle2.putBoolean("mmsRoamingAutoRetrieveByDefault", aoucVar.D);
            }
            if ((aoucVar.c & 64) != 0) {
                bundle2.putString("smsErrorDescMap", String.valueOf(aoucVar.P));
            }
            if ((aoucVar.b & 524288) != 0) {
                bundle2.putBoolean("config_cellBroadcastAppLinks", aoucVar.w);
            }
            if ((aoucVar.c & 1) != 0) {
                bundle2.putString("hiddenContactsData", aoucVar.J);
            }
            if ((aoucVar.c & 8) != 0) {
                bundle2.putBoolean("enableSMSDeliveryReports", aoucVar.M);
            }
            if ((aoucVar.c & 16) != 0) {
                bundle2.putBoolean("smsDeliveryReportSettingOnByDefault", aoucVar.N);
            }
            if ((aoucVar.b & VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT) != 0) {
                bundle2.putInt("maxSubjectLength", aoucVar.A);
            }
            if ((aoucVar.b & Integer.MIN_VALUE) != 0) {
                bundle2.putInt("emailGatewaySmsToMmsTextThreshold", aoucVar.I);
            }
            if ((aoucVar.c & 2) != 0) {
                bundle2.putInt("maxMessageTextSize", aoucVar.K);
            }
            bundle = bundle2;
        }
        xbs xbsVar2 = this.b;
        xbe xbeVar = new xbe(this.c, bundle);
        int i4 = xbeVar.a;
        xbg xbgVar = xbsVar2.b;
        xbgVar.b.lock();
        try {
            xbgVar.e.put(i4, xbeVar);
            xbgVar.b.unlock();
            return arnb.a;
        } catch (Throwable th) {
            xbgVar.b.unlock();
            throw th;
        }
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new xbr(this.b, this.c, arpeVar);
    }
}
