package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aefv implements aefo {
    private final /* synthetic */ int a;

    public aefv(int i) {
        this.a = i;
    }

    @Override // defpackage.aefo
    public final void a(abjq abjqVar) {
        String str;
        abjp abjpVar;
        if (this.a != 0) {
            int aU = a.aU(abjqVar.f);
            if ((aU != 0 && aU == 6 && Log.isLoggable("AppDoctorLogger", 6)) || Log.isLoggable("AppDoctorLogger", 4)) {
                StringBuilder sb = new StringBuilder("AppDoctorEvent<");
                if ((abjqVar.b & 1) != 0) {
                    sb.append("package_name='");
                    sb.append(abjqVar.c);
                    sb.append("' ");
                }
                if ((abjqVar.b & 2) != 0) {
                    sb.append("process_name='");
                    sb.append(abjqVar.d);
                    sb.append("' ");
                }
                sb.append("fix='");
                abjr b = abjr.b(abjqVar.e);
                if (b == null) {
                    b = abjr.UNRECOGNIZED;
                }
                sb.append(b.a());
                sb.append("' status='");
                int aU2 = a.aU(abjqVar.f);
                if (aU2 == 0) {
                    aU2 = 1;
                }
                int i = aU2 - 2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        str = Integer.toString(a.ao(aU2));
                                    } else {
                                        str = "IN_PROGRESS";
                                    }
                                } else {
                                    str = "FAILED";
                                }
                            } else {
                                str = "SKIPPED";
                            }
                        } else {
                            str = "COMPLETED";
                        }
                    } else {
                        str = "PROPOSED";
                    }
                } else {
                    str = "UNSPECIFIED";
                }
                sb.append(str);
                sb.append("' entryPoint='");
                int i2 = abjqVar.g;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            abjpVar = null;
                        } else {
                            abjpVar = abjp.TELEDOCTOR;
                        }
                    } else {
                        abjpVar = abjp.STARTUP;
                    }
                } else {
                    abjpVar = abjp.UNKNOWN;
                }
                if (abjpVar == null) {
                    abjpVar = abjp.UNRECOGNIZED;
                }
                sb.append(abjpVar.a());
                sb.append("'>");
                int aU3 = a.aU(abjqVar.f);
                if (aU3 != 0 && aU3 == 6) {
                    Log.e("AppDoctorLogger", sb.toString());
                } else {
                    Log.i("AppDoctorLogger", sb.toString());
                }
            }
        }
    }
}
