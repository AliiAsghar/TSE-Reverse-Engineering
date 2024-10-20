package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.StringJoiner;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mfc implements uvn {
    public static final xze a = xze.g("Bugle", "RecentMessageCodesService");
    public final wul b;
    private final anen c;

    public mfc(wul wulVar, anen anenVar) {
        this.b = wulVar;
        this.c = anenVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static alor a(mfb mfbVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Optional empty;
        String aJ;
        char c;
        alok alokVar = new alok();
        if ((mfbVar.b & 1) == 0) {
            str = "None";
        } else {
            str = String.valueOf(mfbVar.c);
        }
        alokVar.h("last_outgoing_sms_error_code", str);
        if ((mfbVar.b & 2) == 0) {
            str2 = "None";
        } else {
            str2 = String.valueOf(mfbVar.d);
        }
        alokVar.h("last_outgoing_sms_result_code", str2);
        if ((mfbVar.b & 4) == 0) {
            str3 = "None";
        } else {
            str3 = String.valueOf(mfbVar.e);
        }
        alokVar.h("last_outgoing_mms_result_code", str3);
        if ((mfbVar.b & 32) == 0) {
            str4 = "None";
        } else {
            str4 = String.valueOf(mfbVar.i);
        }
        alokVar.h("last_mms_connection_failure_code", str4);
        if ((mfbVar.b & 8) == 0) {
            str5 = "None";
        } else {
            str5 = String.valueOf(mfbVar.f);
        }
        alokVar.h("last_outgoing_rcs_result_code", str5);
        if ((mfbVar.b & 16) == 0) {
            str6 = "None";
        } else {
            int e = aotl.e(mfbVar.g);
            if (e == 0) {
                e = 1;
            }
            str6 = String.valueOf(e - 1);
        }
        alokVar.h("last_outgoing_chat_session_event_info", str6);
        Iterator it = alzz.ar(mfbVar.h).iterator();
        while (true) {
            if (it.hasNext()) {
                mex mexVar = (mex) it.next();
                int aJ2 = a.aJ(mexVar.c);
                if (aJ2 != 0 && aJ2 == 3 && !g(mexVar)) {
                    empty = Optional.of(Integer.valueOf(mexVar.g));
                    break;
                }
            } else {
                empty = Optional.empty();
                break;
            }
        }
        alokVar.h("last_mms_download_result_code", (String) empty.map(new lvo(18)).orElse("None"));
        if ((mfbVar.b & 64) != 0) {
            alokVar.h("last_outgoing_slm_result_code", String.valueOf(mfbVar.j));
        }
        if (mfbVar.h.size() > 0) {
            StringJoiner stringJoiner = new StringJoiner("\n");
            apax apaxVar = mfbVar.h;
            for (int i = 0; i < apaxVar.size(); i++) {
                StringJoiner stringJoiner2 = new StringJoiner(", ", "{ ", " }");
                mex mexVar2 = (mex) apaxVar.get(i);
                StringBuilder sb = new StringBuilder();
                sb.append("type: ");
                if (g(mexVar2)) {
                    int aJ3 = a.aJ(mexVar2.c);
                    if (aJ3 == 0) {
                        aJ3 = 1;
                    }
                    aJ = akec.aJ(aJ3).concat("_SLM");
                } else {
                    int aJ4 = a.aJ(mexVar2.c);
                    if (aJ4 == 0) {
                        aJ4 = 1;
                    }
                    aJ = akec.aJ(aJ4);
                }
                sb.append(aJ);
                StringJoiner add = stringJoiner2.add(sb);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("message_id: ");
                amgx amgxVar = mexVar2.d;
                if (amgxVar == null) {
                    amgxVar = amgx.a;
                }
                sb2.append(amgxVar.c);
                StringJoiner add2 = add.add(sb2).add("x_message_id: " + mexVar2.n);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("message_status: ");
                sb3.append(mexVar2.e);
                StringJoiner add3 = add2.add(sb3);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("result_code: ");
                sb4.append(mexVar2.g);
                add3.add(sb4).add("conversation_type: " + mexVar2.o);
                int aJ5 = a.aJ(mexVar2.c);
                if (aJ5 == 0) {
                    aJ5 = 1;
                }
                int i2 = aJ5 - 1;
                if (i2 != 1) {
                    if (i2 != 2) {
                        c = 3;
                        if (i2 == 3) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("rcs_message_id: ");
                            amgx amgxVar2 = mexVar2.d;
                            if (amgxVar2 == null) {
                                amgxVar2 = amgx.a;
                            }
                            sb5.append(amgxVar2.d);
                            StringJoiner add4 = stringJoiner2.add(sb5);
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("chat_session_event_info: ");
                            int e2 = aotl.e(mexVar2.h);
                            if (e2 == 0) {
                                e2 = 1;
                            }
                            sb6.append(e2 - 1);
                            add4.add(sb6);
                        }
                    } else {
                        c = 3;
                        if (!g(mexVar2)) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("last_mms_connection_failure_code: ");
                            sb7.append(mexVar2.i);
                            stringJoiner2.add(sb7);
                        }
                    }
                } else {
                    c = 3;
                    if (!g(mexVar2)) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("sms_error_code: ");
                        sb8.append(mexVar2.f);
                        stringJoiner2.add(sb8);
                    }
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append("retry: ");
                sb9.append(mexVar2.j);
                sb9.append("/");
                sb9.append(mexVar2.k);
                stringJoiner2.add(sb9);
                mey meyVar = mexVar2.l;
                if (meyVar == null) {
                    meyVar = mey.b;
                }
                StringJoiner stringJoiner3 = new StringJoiner(", ", "{ ", " }");
                StringBuilder sb10 = new StringBuilder();
                sb10.append("airplaneMode: ");
                sb10.append(meyVar.d);
                StringJoiner add5 = stringJoiner3.add(sb10);
                StringBuilder sb11 = new StringBuilder();
                sb11.append("mobileData: ");
                sb11.append(meyVar.e);
                StringJoiner add6 = add5.add(sb11);
                StringBuilder sb12 = new StringBuilder();
                sb12.append("signalStrength: ");
                sb12.append(meyVar.f);
                StringJoiner add7 = add6.add(sb12);
                StringBuilder sb13 = new StringBuilder();
                sb13.append("networkTransport: ");
                sb13.append(Arrays.toString(Collection.EL.stream(new apaq(meyVar.g, mey.a)).map(new lvo(20)).toArray()));
                add7.add(sb13);
                StringBuilder sb14 = new StringBuilder();
                sb14.append("network_conditions: ");
                sb14.append(stringJoiner3);
                stringJoiner2.add(sb14);
                stringJoiner.add(stringJoiner2.toString());
            }
            alokVar.h("last_messages_codes", stringJoiner.toString());
        }
        return alokVar.b();
    }

    public static boolean g(mex mexVar) {
        amgt b = amgt.b(mexVar.m);
        if (b == null) {
            b = amgt.UNSPECIFIED;
        }
        return b.equals(amgt.SLM);
    }

    @Override // defpackage.uvn
    public final /* synthetic */ akul b() {
        return uvl.b();
    }

    @Override // defpackage.uvn
    public final /* synthetic */ akul c() {
        return uvl.c();
    }

    @Override // defpackage.uvn
    public final akul d() {
        return this.b.h().i(new jab(6), this.c).h(new mdr(10), this.c);
    }

    public final void e(mex mexVar) {
        f(mexVar, false);
    }

    public final void f(mex mexVar, boolean z) {
        this.b.m(new vfq(z, mexVar, 1));
    }
}
