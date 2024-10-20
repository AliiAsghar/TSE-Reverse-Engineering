package defpackage;

import android.os.Process;
import android.util.Log;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.Collection;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class xzx {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/common/TrackingLog");
    public final StringBuilder b;
    public String c;
    public boolean d;
    private int e;
    private final xza f;
    private final int g;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        xzi gd();
    }

    public xzx() {
        this.b = new StringBuilder();
        this.g = 1;
        this.f = null;
    }

    public final void A(String str, boolean z) {
        if (this.d) {
            p(str);
            this.b.append(z);
        }
    }

    public final void B(String str, Object[] objArr) {
        if (this.d) {
            p(str);
            if (objArr == null) {
                this.b.append("null");
                return;
            }
            this.b.append('{');
            int length = objArr.length;
            if (length > 0) {
                this.b.append(objArr[0]);
                for (int i = 1; i < length; i++) {
                    StringBuilder sb = this.b;
                    sb.append(", ");
                    sb.append(objArr[i]);
                }
            }
            this.b.append('}');
        }
    }

    public final void C(String str, CharSequence charSequence) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(' ');
            sb.append(str);
            sb.append('{');
            sb.append(yyb.bh(charSequence));
            sb.append('}');
        }
    }

    public final void D(String str, String str2, int i) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(' ');
            sb.append(str);
            sb.append('{');
            sb.append(str2);
            sb.append(':');
            sb.append(i);
            sb.append('}');
        }
    }

    public final void E(String str, String str2, Object obj) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(' ');
            sb.append(str);
            sb.append('{');
            sb.append(str2);
            sb.append(':');
            sb.append(obj);
            sb.append('}');
        }
    }

    public final void F(int i) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(' ');
            sb.append(i);
        }
    }

    public final void G(long j) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(' ');
            sb.append(j);
        }
    }

    public final void H(Object obj) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(' ');
            sb.append(obj);
        }
    }

    public final void I(boolean z) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(' ');
            sb.append(z);
        }
    }

    @Deprecated
    public final void J(xyw xywVar, Object obj) {
        if (this.d && !xywVar.a(this, obj)) {
            this.d = false;
            this.b.setLength(0);
        }
    }

    public final void K(String str, Collection collection) {
        if (collection == null) {
            E(str, "size", "null");
        } else {
            D(str, "size", collection.size());
        }
    }

    public final void L(String str, CharSequence charSequence) {
        w(str, charSequence, 1);
    }

    public final void M(String str, Object obj) {
        String obj2;
        if (this.d) {
            p(str);
            a aVar = (a) yyb.aL(a.class);
            StringBuilder sb = this.b;
            xzi gd = aVar.gd();
            if (obj == null) {
                obj2 = "";
            } else {
                obj2 = obj.toString();
            }
            sb.append(gd.a(obj2, 1));
        }
    }

    public final void N(String str, Collection collection) {
        if (!collection.isEmpty()) {
            K(str, collection);
        }
    }

    public final void p(String str) {
        char charAt;
        int length = this.b.length();
        if (length > 0 && (charAt = this.b.charAt(length - 1)) != '.' && charAt != ',' && charAt != ';' && charAt != ':') {
            this.b.append(',');
        }
        StringBuilder sb = this.b;
        sb.append(' ');
        sb.append(str);
        sb.append(": ");
    }

    public final void q() {
        xza xzaVar;
        String str;
        if (this.d && this.b.length() > 0) {
            boolean z = true;
            if (this.g != 1 && (xzaVar = this.f) != null) {
                int i = this.e;
                String str2 = this.c;
                String sb = this.b.toString();
                Locale locale = Locale.US;
                String format = xzaVar.c.format(Long.valueOf(System.currentTimeMillis()));
                Integer valueOf = Integer.valueOf(Process.myPid());
                Integer valueOf2 = Integer.valueOf(Process.myTid());
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 6) {
                                    str = "?";
                                } else {
                                    str = "E";
                                }
                            } else {
                                str = "W";
                            }
                        } else {
                            str = "I";
                        }
                    } else {
                        str = "D";
                    }
                } else {
                    str = "V";
                }
                xzaVar.b.execute(new wnc(xzaVar, String.format(locale, "%s %5d %5d %s %s: %s\n", format, valueOf, valueOf2, str, str2, sb), 16, null));
            } else {
                int i2 = this.e;
                String str3 = this.c;
                String sb2 = this.b.toString();
                if (xzb.q(str3, i2)) {
                    if (str3.length() > 23) {
                        z = false;
                    }
                    d.t(z, "Tag must be <=23 chars");
                    alvg a2 = xzb.a.a(xzb.b(i2));
                    a2.X(alwp.a, str3);
                    a2.Y(alvr.a);
                    ((alvg) a2.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "println", 539, "LogUtil.java")).t("%s", sb2);
                }
            }
            this.b.setLength(0);
        }
    }

    public final void r(Throwable th) {
        if (!this.d) {
            return;
        }
        if (this.g == 1) {
            alvg a2 = a.a(xzb.b(this.e));
            a2.X(alwp.a, this.c);
            a2.Y(alvr.a);
            ((alvg) ((alvg) a2.g(th)).h("com/google/android/apps/messaging/shared/util/common/TrackingLog", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME, 80, "TrackingLog.java")).t("%s", this.b);
            this.b.setLength(0);
            return;
        }
        if (this.b.length() > 0) {
            this.b.append('\n');
        }
        this.b.append(Log.getStackTraceString(th));
        q();
    }

    public final void s(int i, String str, xyx xyxVar) {
        boolean z = true;
        if (this.g != 2 && !xzb.q(str, i)) {
            z = false;
        }
        this.d = z;
        if (z) {
            this.e = i;
            this.c = str;
            xyxVar.a(this.b);
            this.b.append(':');
        }
    }

    public final void t(char c) {
        if (this.d) {
            this.b.append(c);
        }
    }

    public final void u(Object obj) {
        if (this.d) {
            this.b.append(obj);
        }
    }

    public final void v(long j) {
        if (this.d) {
            StringBuilder sb = this.b;
            sb.append(" {x-message-id:");
            sb.append(j);
            sb.append('}');
        }
    }

    public final void w(String str, CharSequence charSequence, int i) {
        String charSequence2;
        if (this.d) {
            p(str);
            a aVar = (a) yyb.aL(a.class);
            StringBuilder sb = this.b;
            xzi gd = aVar.gd();
            if (charSequence == null) {
                charSequence2 = "";
            } else {
                charSequence2 = charSequence.toString();
            }
            sb.append(gd.a(charSequence2, i));
        }
    }

    public final void x(String str, int i) {
        if (this.d) {
            p(str);
            this.b.append(i);
        }
    }

    public final void y(String str, long j) {
        if (this.d) {
            p(str);
            this.b.append(j);
        }
    }

    public final void z(String str, Object obj) {
        if (this.d) {
            p(str);
            this.b.append(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public xzx(xza xzaVar) {
        this.b = new StringBuilder();
        this.g = 2;
        this.f = xzaVar;
    }
}
