package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsl implements frl {
    private static final Pattern a = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern b = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder c = new StringBuilder();
    private final ArrayList d = new ArrayList();
    private final euf e = new euf();

    public static float d(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return 0.92f;
                }
                throw new IllegalArgumentException();
            }
            return 0.5f;
        }
        return 0.08f;
    }

    private static long e(Matcher matcher, int i) {
        long j;
        String group = matcher.group(i + 1);
        if (group != null) {
            j = Long.parseLong(group) * 3600000;
        } else {
            j = 0;
        }
        String group2 = matcher.group(i + 2);
        dzg.g(group2);
        long parseLong = Long.parseLong(group2) * 60000;
        String group3 = matcher.group(i + 3);
        dzg.g(group3);
        long parseLong2 = Long.parseLong(group3) * 1000;
        String group4 = matcher.group(i + 4);
        long j2 = j + parseLong + parseLong2;
        if (group4 != null) {
            j2 += Long.parseLong(group4);
        }
        return j2 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static final esz f(Spanned spanned, String str) {
        char c;
        int i;
        esy esyVar = new esy();
        esyVar.a = spanned;
        if (str == null) {
            return esyVar.a();
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0 && c != 1 && c != 2) {
            if (c != 3 && c != 4 && c != 5) {
                esyVar.g = 1;
                i = 1;
            } else {
                esyVar.g = 2;
                i = 2;
            }
        } else {
            esyVar.g = 0;
            i = 0;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c2 = 0;
                    break;
                }
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c2 = 1;
                    break;
                }
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c2 = 2;
                    break;
                }
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c2 = 3;
                    break;
                }
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c2 = 4;
                    break;
                }
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        if (c2 != 0 && c2 != 1 && c2 != 2) {
            if (c2 != 3 && c2 != 4 && c2 != 5) {
                esyVar.e = 1;
            } else {
                esyVar.e = 0;
            }
        } else {
            esyVar.e = 2;
        }
        esyVar.f = d(i);
        esyVar.c(d(esyVar.e), 0);
        return esyVar.a();
    }

    @Override // defpackage.frl
    public final /* synthetic */ frc a(byte[] bArr, int i, int i2) {
        return fsm.b(this, bArr, i2);
    }

    @Override // defpackage.frl
    public final void b(byte[] bArr, int i, int i2, frk frkVar, etm etmVar) {
        String str;
        this.e.H(bArr, i + i2);
        this.e.J(i);
        Charset A = this.e.A();
        if (A == null) {
            A = StandardCharsets.UTF_8;
        }
        while (true) {
            String v = this.e.v(A);
            if (v != null) {
                if (v.length() != 0) {
                    try {
                        Integer.parseInt(v);
                        String v2 = this.e.v(A);
                        if (v2 == null) {
                            eub.f("SubripParser", "Unexpected end");
                            return;
                        }
                        Matcher matcher = a.matcher(v2);
                        if (matcher.matches()) {
                            long e = e(matcher, 1);
                            long e2 = e(matcher, 6);
                            int i3 = 0;
                            this.c.setLength(0);
                            this.d.clear();
                            String v3 = this.e.v(A);
                            while (!TextUtils.isEmpty(v3)) {
                                if (this.c.length() > 0) {
                                    this.c.append("<br>");
                                }
                                StringBuilder sb = this.c;
                                ArrayList arrayList = this.d;
                                String trim = v3.trim();
                                StringBuilder sb2 = new StringBuilder(trim);
                                Matcher matcher2 = b.matcher(trim);
                                int i4 = i3;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList.add(group);
                                    int start = matcher2.start() - i4;
                                    int length = group.length();
                                    sb2.replace(start, start + length, "");
                                    i4 += length;
                                }
                                sb.append(sb2.toString());
                                v3 = this.e.v(A);
                                i3 = 0;
                            }
                            Spanned fromHtml = Html.fromHtml(this.c.toString());
                            int i5 = 0;
                            while (true) {
                                if (i5 < this.d.size()) {
                                    str = (String) this.d.get(i5);
                                    if (str.matches("\\{\\\\an[1-9]\\}")) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                } else {
                                    str = null;
                                    break;
                                }
                            }
                            etmVar.a(new xab(alog.r(f(fromHtml, str)), e, e2 - e));
                        } else {
                            eub.f("SubripParser", "Skipping invalid timing: ".concat(v2));
                        }
                    } catch (NumberFormatException unused) {
                        eub.f("SubripParser", "Skipping invalid index: ".concat(v));
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.frl
    public final /* synthetic */ void c() {
    }
}
