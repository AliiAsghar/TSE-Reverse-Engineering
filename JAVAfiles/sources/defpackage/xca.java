package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xca {
    public static final xze a = xze.g("BugleDataModel", "MmsSmsUtils");
    public static final alhr b = uuh.x(206791863, "enable_cdma_delivery_report_status");
    public final Context c;
    private String[] d;
    private final apwt e;
    private final apwt f;
    private final armf g;
    private final armf h;
    private final armf i;

    public xca(Context context, apwt apwtVar, apwt apwtVar2, armf armfVar, armf armfVar2, armf armfVar3) {
        this.c = context;
        this.e = apwtVar;
        this.f = apwtVar2;
        this.g = armfVar;
        this.h = armfVar2;
        this.i = armfVar3;
    }

    public static int a(boolean z, boolean z2, int i) {
        if (z) {
            if (i == 4 || i == 5) {
                return 8;
            }
            return 1;
        }
        if (!z2) {
            return 100;
        }
        return 101;
    }

    public static int b(boolean z, int i, int i2) {
        if (z) {
            if (i == 4 || i == 6) {
                return 5;
            }
            if (i == 5 || (i == 2 && i2 == 64)) {
                return 8;
            }
            if (i2 == 0) {
                return 2;
            }
            return 1;
        }
        return 100;
    }

    public static int c(int i) {
        if (i != 135) {
            if (i != 136) {
                if (i != 193) {
                    if (i != 229) {
                        switch (i) {
                            case 130:
                                return R.string.mms_failure_outgoing_service;
                            case 131:
                                return R.string.mms_failure_outgoing_corrupt;
                            case 132:
                                return R.string.mms_failure_outgoing_address;
                            default:
                                switch (i) {
                                    case 225:
                                        return R.string.mms_failure_outgoing_service;
                                    case 226:
                                        return R.string.mms_failure_outgoing_corrupt;
                                    case 227:
                                        return R.string.mms_failure_outgoing_address;
                                    default:
                                        switch (i) {
                                            case 10000:
                                                return R.string.mms_failure_outgoing_too_large;
                                            case 10001:
                                                return R.string.mms_failure_attachment_failed;
                                            case 10002:
                                                return R.string.mms_failure_lost_rcs_v2;
                                            case 10003:
                                                return R.string.mms_failure_outgoing_unsupported;
                                            default:
                                                return R.string.message_status_trouble_sending;
                                        }
                                }
                        }
                    }
                    return R.string.mms_failure_outgoing_content;
                }
                return R.string.mms_failure_outgoing_address;
            }
            return R.string.mms_failure_outgoing_unsupported;
        }
        return R.string.mms_failure_outgoing_content;
    }

    public final String d(Resources resources, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.d == null) {
            this.d = resources.getStringArray(R.array.empty_subject_strings);
        }
        for (String str2 : this.d) {
            if (albo.ar(str, str2)) {
                return null;
            }
        }
        return str;
    }

    public final String e(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return a.cq(i, " (check MmsSmsUtils)");
                    }
                    return "NO_RETRY";
                }
                return "MANUAL_RETRY";
            }
            return "AUTO_RETRY";
        }
        return "SUCCEEDED";
    }

    public final String f(String str) {
        return ((msx) this.f.b()).d(str);
    }

    public final void g(Intent intent) {
        intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
    }

    public final boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return i(str, ((yju) this.e.b()).c());
    }

    public final boolean i(String str, String str2) {
        try {
            return ((anhn) this.g.b()).k(((anhn) this.g.b()).o(str, str2));
        } catch (anhk unused) {
            return false;
        }
    }

    public final boolean j(String str) {
        if (!TextUtils.isEmpty(str) && !msx.g(str) && msx.f(str)) {
            return true;
        }
        return false;
    }

    public final boolean k(String str) {
        if (msx.i(str) && !msx.g(str)) {
            return true;
        }
        return false;
    }

    public final boolean l(String str) {
        return ((msx) this.f.b()).j(str);
    }

    public final boolean m(String str) {
        if ((((Boolean) this.i.b()).booleanValue() && ((Optional) ((apxx) this.h).a).filter(new wjl(8)).isPresent()) || ((msx) this.f.b()).j(str) || msx.g(str)) {
            return true;
        }
        return false;
    }
}
