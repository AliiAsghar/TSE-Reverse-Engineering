package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wyq {
    private static final alvi d = alvi.m("com/google/android/apps/messaging/shared/sms/MmsDebugUtils");
    public final Context a;
    public final xnv b;
    public final yck c;
    private final ykw e;

    public wyq(Context context, xnv xnvVar, ykw ykwVar, yck yckVar) {
        this.a = context;
        this.b = xnvVar;
        this.e = ykwVar;
        this.c = yckVar;
    }

    public static gt a(byte[] bArr) {
        gj gjVar = null;
        if (bArr != null) {
            try {
                gjVar = new gr(bArr, true).a();
            } catch (RuntimeException e) {
                alvw d2 = d.d();
                d2.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) d2).g(e)).h("com/google/android/apps/messaging/shared/sms/MmsDebugUtils", "parsePduForAnyCarrier", 'g', "MmsDebugUtils.java")).q("parsePduForAnyCarrier: Failed to parse PDU with content disposition");
            }
            if (gjVar == null) {
                try {
                    gjVar = new gr(bArr, false).a();
                } catch (RuntimeException e2) {
                    alvw d3 = d.d();
                    d3.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) ((alvg) d3).g(e2)).h("com/google/android/apps/messaging/shared/sms/MmsDebugUtils", "parsePduForAnyCarrier", 'n', "MmsDebugUtils.java")).q("parsePduForAnyCarrier: Failed to parse PDU without content disposition");
                }
            }
        }
        if (gjVar instanceof gt) {
            return (gt) gjVar;
        }
        alvw h = d.h();
        h.X(alwp.a, "Bugle");
        ((alvg) ((alvg) h).h("com/google/android/apps/messaging/shared/sms/MmsDebugUtils", "receiveFromDumpFile", 121, "MmsDebugUtils.java")).q("receiveFromDumpFile: Parsing retrieved PDU failure");
        throw new wyr(2, "Failed reading dump file");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final File b(String str, alog alogVar) {
        FileOutputStream fileOutputStream;
        File a = this.c.a(str, true, this.a);
        alvw g = d.g();
        g.X(alwp.a, "Bugle");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/sms/MmsDebugUtils", "writeDumpFile", 212, "MmsDebugUtils.java")).t("dump mms filename: %s", a.getAbsolutePath());
        try {
            fileOutputStream = new FileOutputStream(a);
        } catch (IOException e) {
            alvw h = d.h();
            h.X(alwp.a, "Bugle");
            ((alvg) ((alvg) ((alvg) h).g(e)).h("com/google/android/apps/messaging/shared/sms/MmsDebugUtils", "writeDumpFile", 221, "MmsDebugUtils.java")).t("dumpPdu: %s", e);
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            try {
                alur it = alogVar.iterator();
                while (it.hasNext()) {
                    bufferedOutputStream.write((byte[]) it.next());
                }
                bufferedOutputStream.close();
                yyb.aU(a);
                fileOutputStream.close();
                return a;
            } finally {
            }
        } finally {
        }
    }

    public final String c(gj gjVar) {
        String concat;
        String str = null;
        if (gjVar instanceof gt) {
            gt gtVar = (gt) gjVar;
            if (gtVar.m() != null) {
                str = new String(gtVar.m());
            } else if (gtVar.n() != null) {
                str = new String(gtVar.n());
            }
        }
        if (TextUtils.isEmpty(str)) {
            concat = "";
        } else {
            concat = String.valueOf(str).concat("_");
        }
        return concat.concat(String.valueOf(this.b.g().toString()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(byte[] bArr, gj gjVar) {
        String str;
        String d2;
        if (bArr != null && bArr.length > 0) {
            if (gjVar != null && gjVar.a() == 130) {
                str = "_wappush_";
            } else {
                str = "";
            }
            String str2 = "mmsdump-" + str + c(gjVar) + "_email";
            b(str2, alog.r(bArr));
            if (gjVar != null) {
                String concat = str2.concat("_email");
                StringBuilder sb = new StringBuilder();
                for (int i = 129; i <= 191; i++) {
                    gp gpVar = gjVar.a;
                    int i2 = 0;
                    switch (i) {
                        case 129:
                        case 130:
                        case 151:
                            gi[] l = gpVar.l(i);
                            if (l != null) {
                                ArrayList arrayList = new ArrayList();
                                while (i2 < l.length) {
                                    gi giVar = l[i2];
                                    if (giVar != null) {
                                        arrayList.add(giVar.b());
                                    }
                                    i2++;
                                }
                                d2 = new algs(", ").d(arrayList);
                                break;
                            }
                            break;
                        case 131:
                        case 132:
                        case 138:
                        case 139:
                        case 152:
                        case 158:
                        case 183:
                        case 184:
                        case 185:
                        case 189:
                        case 190:
                            byte[] k = gpVar.k(i);
                            if (k != null) {
                                d2 = new String(k);
                                break;
                            }
                            break;
                        case 133:
                            d2 = new Date(gpVar.b(133)).toString();
                            break;
                        case 134:
                        case 144:
                        case 145:
                        case 162:
                        case 167:
                        case 169:
                        case 171:
                        case 177:
                        case 187:
                        case 188:
                            d2 = gpVar.d(i, gp.c);
                            break;
                        case 135:
                        case 136:
                        case 157:
                            alog alogVar = gp.d;
                            long b = gpVar.b(i);
                            if (b != -1) {
                                int i3 = ((alsx) alogVar).c;
                                while (true) {
                                    if (i2 < i3) {
                                        go goVar = (go) alogVar.get(i2);
                                        i2++;
                                        if (b == goVar.a) {
                                            d2 = goVar.b;
                                            break;
                                        }
                                    } else {
                                        d2 = gp.e(i, Long.valueOf(b));
                                        break;
                                    }
                                }
                            }
                            break;
                        case 137:
                        case 147:
                        case 150:
                        case 154:
                        case 160:
                        case 164:
                        case 166:
                        case 181:
                        case 182:
                            gi c = gpVar.c(i);
                            if (c != null) {
                                d2 = c.b();
                                break;
                            }
                            break;
                        case 140:
                            d2 = gpVar.d(140, gp.b);
                            break;
                        case 141:
                            d2 = gpVar.d(141, gp.e);
                            break;
                        case 142:
                        case 159:
                        case 161:
                        case 173:
                        case 175:
                        case 179:
                            long b2 = gpVar.b(i);
                            if (b2 != -1) {
                                d2 = String.valueOf(b2);
                                break;
                            }
                            break;
                        case 143:
                            d2 = gpVar.d(143, gp.g);
                            break;
                        case 146:
                            d2 = gpVar.d(146, gp.h);
                            break;
                        case 148:
                            d2 = gpVar.d(148, gp.j);
                            break;
                        case 149:
                            d2 = gpVar.d(149, gp.f);
                            break;
                        case 153:
                            d2 = gpVar.d(153, gp.i);
                            break;
                        case 155:
                            d2 = gpVar.d(155, gp.k);
                            break;
                        case 156:
                            d2 = gpVar.d(156, gp.m);
                            break;
                        case 163:
                            d2 = gpVar.d(163, gp.n);
                            break;
                        case 165:
                            d2 = gpVar.d(165, gp.p);
                            break;
                        case 168:
                        case 170:
                        case 172:
                        case 174:
                        case 176:
                        case 178:
                        case 180:
                        default:
                            alvw h = gp.a.h();
                            h.X(alwp.a, "PduParser");
                            ((alvg) ((alvg) h).h("android/support/v7/mms/pdu/PduHeaders", "getFieldDisplayValue", 1160, "PduHeaders.java")).u("PduHeaders: Unknown field: %d (%02x)", i, i);
                            break;
                        case 186:
                            d2 = gpVar.d(186, gp.o);
                            break;
                        case 191:
                            d2 = gpVar.d(191, gp.l);
                            break;
                    }
                    d2 = "PDU header value not present";
                    if (!d2.equals("PDU header value not present")) {
                        sb.append(gp.q[i - 129]);
                        sb.append(": ");
                        sb.append(d2);
                        sb.append("\n");
                    }
                }
                b(concat, alog.s(a.bW(sb.toString(), "Pdu Headers: \n", "\nRaw pdu bytes:\n").getBytes(), bArr));
            }
        }
    }

    public final boolean e(int i, int i2) {
        Resources resources = this.a.getResources();
        return this.e.q(resources.getString(i), resources.getBoolean(i2));
    }

    public final boolean f() {
        if (!this.c.q()) {
            return false;
        }
        return e(R.string.dump_mms_pref_key, R.bool.dump_mms_pref_default);
    }
}
