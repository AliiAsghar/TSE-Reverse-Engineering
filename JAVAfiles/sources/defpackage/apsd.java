package defpackage;

import com.android.vcard.VCardConstants;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import io.grpc.Status;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class apsd {
    public static volatile aqux f;
    public static volatile aqux g;
    public static volatile aqux h;
    public static volatile aqux i;

    private apsd() {
    }

    private static aptb f(InputStream inputStream, aptd aptdVar) {
        boolean z;
        long j;
        try {
            aptc b = aptdVar.b();
            if (b != null) {
                try {
                    byte b2 = b.b;
                    byte b3 = b.a;
                    boolean z2 = true;
                    int i2 = 0;
                    if (b3 != Byte.MIN_VALUE) {
                        if (b3 != -96) {
                            if (b3 != -64) {
                                if (b3 != -32) {
                                    if (b3 != 0 && b3 != 32) {
                                        if (b3 != 64) {
                                            if (b3 == 96) {
                                                aptdVar.d((byte) 96);
                                                String str = new String(aptdVar.e(), StandardCharsets.UTF_8);
                                                g(b2, str.length());
                                                return new apsz(str);
                                            }
                                            throw new apsw("Unidentifiable major type: " + b.a());
                                        }
                                        aptdVar.d((byte) 64);
                                        byte[] e = aptdVar.e();
                                        g(b2, e.length);
                                        return new apsv(aozb.w(e));
                                    }
                                    aptdVar.b();
                                    aptc aptcVar = aptdVar.a;
                                    byte b4 = aptcVar.a;
                                    if (b4 == 0) {
                                        z = true;
                                    } else if (b4 == 32) {
                                        z = false;
                                    } else {
                                        throw new IllegalStateException(String.format("expected major type 0 or 1 but found %s", Integer.valueOf(aptcVar.a())));
                                    }
                                    long a = aptdVar.a();
                                    if (a >= 0) {
                                        if (!z) {
                                            a = ~a;
                                        }
                                        if (a > 0) {
                                            j = a;
                                        } else {
                                            j = ~a;
                                        }
                                        g(b2, j);
                                        return new apsx(a);
                                    }
                                    throw new UnsupportedOperationException(String.format("the maximum supported unsigned/negative integer is %s", Long.MAX_VALUE));
                                }
                                aptdVar.d((byte) -32);
                                if (aptdVar.a.b <= 24) {
                                    int a2 = (int) aptdVar.a();
                                    if (a2 == 20) {
                                        z2 = false;
                                    } else if (a2 != 21) {
                                        throw new IllegalStateException(String.format("expected FALSE or TRUE", new Object[0]));
                                    }
                                    return new apsu(z2);
                                }
                                throw new IllegalStateException("expected simple value");
                            }
                            throw new apsw("Tags are currently unsupported");
                        }
                        aptdVar.d((byte) -96);
                        aptdVar.c();
                        long a3 = aptdVar.a();
                        if (a3 >= 0 && a3 <= 4611686018427387903L) {
                            if (a3 > 0) {
                                aptdVar.b.H(a3 + a3);
                            }
                            if (a3 <= 1000) {
                                g(b2, a3);
                                int i3 = (int) a3;
                                asmb[] asmbVarArr = new asmb[i3];
                                aptb aptbVar = null;
                                int i4 = 0;
                                while (i4 < a3) {
                                    aptb f2 = f(inputStream, aptdVar);
                                    if (aptbVar != null && f2.compareTo(aptbVar) <= 0) {
                                        throw new apss(String.format("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s", aptbVar.toString(), f2.toString()));
                                    }
                                    asmbVarArr[i4] = new asmb(f2, f(inputStream, aptdVar));
                                    i4++;
                                    aptbVar = f2;
                                }
                                TreeMap treeMap = new TreeMap();
                                while (i2 < i3) {
                                    asmb asmbVar = asmbVarArr[i2];
                                    if (!treeMap.containsKey(asmbVar.a)) {
                                        treeMap.put(asmbVar.a, asmbVar.b);
                                        i2++;
                                    } else {
                                        throw new apss("Attempted to add duplicate key to canonical CBOR Map.");
                                    }
                                }
                                return new apsy(alqc.a(treeMap, alqc.a));
                            }
                            throw new apsw("Parser being asked to read a large CBOR map");
                        }
                        throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
                    }
                    aptdVar.d(Byte.MIN_VALUE);
                    aptdVar.c();
                    long a4 = aptdVar.a();
                    if (a4 >= 0) {
                        if (a4 > 0) {
                            aptdVar.b.H(a4);
                        }
                        if (a4 <= 1000) {
                            g(b2, a4);
                            aptb[] aptbVarArr = new aptb[(int) a4];
                            while (i2 < a4) {
                                aptbVarArr[i2] = f(inputStream, aptdVar);
                                i2++;
                            }
                            return new apst(alog.p(aptbVarArr));
                        }
                        throw new apsw("Parser being asked to read a large CBOR array");
                    }
                    throw new UnsupportedOperationException(String.format("the maximum supported array length is %s", Long.MAX_VALUE));
                } catch (IOException | RuntimeException e2) {
                    throw new apsw(e2);
                }
            }
            throw new apsw("Parser being asked to parse an empty input stream");
        } catch (IOException e3) {
            throw new apsw(e3);
        }
    }

    private static void g(byte b, long j) {
        switch (b) {
            case 24:
                if (j < 24) {
                    throw new apss(a.cn(j, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case 25:
                if (j < 256) {
                    throw new apss(a.cn(j, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j < 65536) {
                    throw new apss(a.cn(j, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    throw new apss(a.cn(j, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }

    public static apsc i(aqrs aqrsVar) {
        return (apsc) apsc.g(new wci(6), aqrsVar);
    }

    public static aptb j(InputStream inputStream, aptd aptdVar) {
        boolean z;
        try {
            aptb f2 = f(inputStream, aptdVar);
            if (z) {
                try {
                    aptdVar.close();
                } catch (IOException unused) {
                }
            }
            return f2;
        } finally {
            if (inputStream instanceof ByteArrayInputStream) {
                try {
                    aptdVar.close();
                } catch (IOException unused2) {
                }
            }
        }
    }

    public static /* synthetic */ aptt k(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (aptt) s;
    }

    public static void l(apts aptsVar, aozy aozyVar) {
        aptsVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aptt apttVar = (aptt) aozyVar.b;
        aptt apttVar2 = aptt.a;
        apttVar.c = aptsVar.a();
    }

    public static void m(aptw aptwVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aptt apttVar = (aptt) aozyVar.b;
        aptt apttVar2 = aptt.a;
        apttVar.f = aptwVar;
        apttVar.b |= 1;
    }

    public static void n(int i2, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aptt apttVar = (aptt) aozyVar.b;
        aptt apttVar2 = aptt.a;
        apttVar.d = a.an(i2);
    }

    public static void o(int i2, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aptt apttVar = (aptt) aozyVar.b;
        aptt apttVar2 = aptt.a;
        apttVar.e = a.ak(i2);
    }

    public static int p(int i2) {
        switch (i2) {
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
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            case 80:
                return 81;
            case 81:
                return 82;
            case 82:
                return 83;
            case 83:
                return 84;
            case 84:
                return 85;
            case 85:
                return 86;
            case 86:
                return 87;
            case 87:
                return 88;
            case 88:
                return 89;
            case 89:
                return 90;
            case 90:
                return 91;
            case 91:
                return 92;
            case 92:
                return 93;
            case 93:
                return 94;
            case 94:
                return 95;
            case 95:
                return 96;
            case 96:
                return 97;
            case 97:
                return 98;
            case 98:
                return 99;
            case 99:
                return 100;
            case VCardConstants.DEFAULT_PREF /* 100 */:
                return 101;
            case 101:
                return 102;
            case 102:
                return 103;
            case 103:
                return 104;
            case 104:
                return 105;
            case 105:
                return 106;
            case 106:
                return 107;
            case 107:
                return 108;
            case 108:
                return 109;
            case 109:
                return 110;
            case 110:
                return 111;
            case 111:
                return 112;
            case 112:
                return 113;
            case 113:
                return 114;
            case 114:
                return 115;
            case 115:
                return 116;
            case 116:
                return 117;
            case 117:
                return 118;
            case 118:
                return 119;
            case 119:
                return 120;
            case 120:
                return 121;
            case 121:
                return 122;
            case 122:
                return 123;
            case 123:
                return 124;
            case 124:
                return 125;
            case 125:
                return 126;
            case 126:
                return 127;
            case 127:
                return 128;
            case 128:
                return 129;
            case 129:
                return 130;
            case 130:
                return 131;
            case 131:
                return 132;
            case 132:
                return 133;
            case 133:
                return 134;
            case 134:
                return 135;
            case 135:
                return 136;
            case 136:
                return 137;
            case 137:
                return 138;
            case 138:
                return 139;
            case 139:
                return 140;
            case 140:
                return 141;
            case 141:
                return 142;
            case 142:
                return 143;
            case 143:
                return 144;
            case 144:
                return 145;
            case 145:
                return 146;
            case 146:
                return 147;
            case 147:
                return 148;
            case 148:
                return 149;
            case 149:
                return 150;
            case 150:
                return 151;
            case 151:
                return 152;
            case 152:
                return 153;
            case 153:
                return 154;
            case 154:
                return 155;
            case 155:
                return 156;
            case 156:
                return 157;
            case 157:
                return 158;
            case 158:
                return 159;
            case 159:
                return 160;
            case 160:
                return 161;
            case 161:
                return 162;
            case 162:
                return 163;
            case 163:
                return 164;
            case 164:
                return 165;
            case 165:
                return 166;
            case 166:
                return 167;
            case 167:
                return 168;
            case 168:
                return 169;
            case 169:
                return 170;
            case 170:
                return 171;
            case 171:
                return 172;
            case 172:
                return 173;
            case 173:
                return 174;
            case 174:
                return 175;
            case 175:
                return 176;
            case 176:
                return 177;
            case 177:
                return 178;
            case 178:
                return 179;
            case 179:
                return 180;
            case 180:
                return 181;
            case 181:
                return 182;
            case 182:
                return 183;
            case 183:
                return 184;
            case 184:
                return 185;
            case 185:
                return 186;
            case 186:
                return 187;
            case 187:
                return 188;
            case 188:
                return 189;
            case 189:
                return 190;
            case 190:
                return 191;
            case 191:
                return 192;
            case 192:
                return 193;
            case 193:
                return 194;
            case 194:
                return 195;
            case 195:
                return 196;
            case 196:
                return 197;
            case 197:
                return 198;
            case 198:
                return 199;
            case 199:
                return BasePaymentResult.ERROR_REQUEST_FAILED;
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                return BasePaymentResult.ERROR_REQUEST_TIMEOUT;
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                return BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                return BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                return 204;
            case 204:
                return 205;
            case 205:
                return 206;
            case 206:
                return 207;
            case 207:
                return 208;
            case 208:
                return 209;
            case 209:
                return 210;
            case 210:
                return 211;
            case 211:
                return 212;
            case 212:
                return 213;
            case 213:
                return 214;
            case 214:
                return 215;
            case 215:
                return 216;
            case 216:
                return 217;
            case 217:
                return 218;
            case 218:
                return 219;
            case 219:
                return 220;
            case 220:
                return 221;
            case 221:
                return 222;
            case 222:
                return 223;
            case 223:
                return 224;
            case 224:
                return 225;
            case 225:
                return 226;
            case 226:
                return 227;
            case 227:
                return 228;
            case 228:
                return 229;
            case 229:
                return 230;
            case 230:
                return 231;
            case 231:
                return 232;
            case 232:
                return 233;
            case 233:
                return 234;
            case 234:
                return 235;
            case 235:
                return 236;
            case 236:
                return 237;
            case 237:
                return 238;
            case 238:
                return 239;
            case 239:
                return 240;
            case 240:
                return 241;
            case 241:
                return 242;
            case 242:
                return 243;
            case 243:
                return 244;
            case 244:
                return 245;
            case 245:
                return 246;
            case 246:
                return 247;
            case 247:
                return 248;
            case 248:
                return 249;
            case 249:
                return 250;
            default:
                return 0;
        }
    }

    public static aqrs q(aqrs aqrsVar, List list) {
        aqrsVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqrsVar = new aqrw(aqrsVar, (aqrv) it.next());
        }
        return aqrsVar;
    }

    public static aqrs r(aqrs aqrsVar, aqrv... aqrvVarArr) {
        return q(aqrsVar, Arrays.asList(aqrvVarArr));
    }

    public static aqrs s(aqrs aqrsVar, List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse(arrayList);
        return q(aqrsVar, arrayList);
    }

    public static aqrs t(aqrs aqrsVar, aqrv... aqrvVarArr) {
        return s(aqrsVar, Arrays.asList(aqrvVarArr));
    }

    public void a(Status status, aqut aqutVar) {
        throw null;
    }

    public aqrx b() {
        throw null;
    }

    public void d(Object obj) {
        throw null;
    }

    public apsd(char[] cArr) {
    }

    public void e() {
    }

    public void c(aqut aqutVar) {
    }
}
