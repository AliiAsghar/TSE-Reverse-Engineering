package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Comparator;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agoi extends agml {
    static final Comparator a = Comparator.CC.naturalOrder();
    static final java.util.Comparator b = Comparator.CC.naturalOrder();
    static final java.util.Comparator c = Comparator.CC.naturalOrder();
    static final java.util.Comparator g = Comparator.CC.naturalOrder();
    static final java.util.Comparator h = Comparator.CC.naturalOrder();
    static final java.util.Comparator i = Comparator.CC.naturalOrder();
    private final Number j;
    private final int k;

    public agoi(String str, int i2, Number number) {
        super(str);
        this.k = i2;
        this.j = number;
    }

    private static final int h(int i2) {
        if (i2 < 0) {
            return 3;
        }
        if (i2 == 0) {
            return 1;
        }
        return 2;
    }

    @Override // defpackage.agpy
    public final void a(agpo agpoVar, StringBuilder sb, List list) {
        if (agpoVar.c) {
            sb.append('(');
            sb.append(f(agpoVar.a()));
            sb.append(' ');
            sb.append(g(this.k));
            sb.append("?)");
            list.add(this.j.toString());
            return;
        }
        sb.append('(');
        sb.append(f(agpoVar.a()));
        sb.append(' ');
        sb.append(g(this.k));
        sb.append(" ");
        sb.append(this.j);
        sb.append(")");
    }

    @Override // defpackage.agpy
    public final void b(agpo agpoVar, StringBuilder sb) {
        sb.append('(');
        sb.append(f(agpoVar.a()));
        sb.append(' ');
        sb.append(g(this.k));
        sb.append(' ');
        sb.append(this.j);
        sb.append(')');
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agpy
    public final boolean c(String str, ContentValues contentValues) {
        int h2;
        int intValue;
        if (TextUtils.equals(str, this.e)) {
            String str2 = this.f;
            Number number = this.j;
            if (number instanceof Byte) {
                if (contentValues.get(str2) != null) {
                    h2 = h(a.compare(contentValues.getAsByte(str2), Byte.valueOf(this.j.byteValue())));
                }
                h2 = 4;
            } else if (number instanceof Short) {
                if (contentValues.get(str2) != null) {
                    h2 = h(b.compare(contentValues.getAsShort(str2), Short.valueOf(this.j.shortValue())));
                }
                h2 = 4;
            } else if (number instanceof Integer) {
                Object obj = contentValues.get(str2);
                if (obj != null) {
                    try {
                        java.util.Comparator comparator = c;
                        Integer valueOf = Integer.valueOf(this.j.intValue());
                        if (obj instanceof Boolean) {
                            if (((Boolean) obj).booleanValue()) {
                                intValue = 1;
                            } else {
                                intValue = 0;
                            }
                        } else {
                            intValue = ((Integer) obj).intValue();
                        }
                        h2 = h(comparator.compare(valueOf, Integer.valueOf(intValue)));
                    } catch (ClassCastException unused) {
                        Log.e("foobar", "ClassCastException retrieving column value for ".concat(String.valueOf(str2)));
                    }
                }
                h2 = 4;
            } else if (number instanceof Long) {
                if (contentValues.get(str2) != null) {
                    h2 = h(g.compare(contentValues.getAsLong(str2), Long.valueOf(this.j.longValue())));
                }
                h2 = 4;
            } else if (number instanceof Float) {
                if (contentValues.get(str2) != null) {
                    h2 = h(h.compare(contentValues.getAsFloat(str2), Float.valueOf(this.j.floatValue())));
                }
                h2 = 4;
            } else if (number instanceof Double) {
                if (contentValues.get(str2) != null) {
                    h2 = h(i.compare(contentValues.getAsDouble(str2), Double.valueOf(this.j.doubleValue())));
                }
                h2 = 4;
            }
            int i2 = this.k;
            if (h2 == 4) {
                return true;
            }
            int i3 = i2 - 1;
            if (i3 != 0) {
                if (i3 != 1) {
                    switch (i3) {
                        case 6:
                            if (h2 == 3) {
                                return false;
                            }
                            break;
                        case 7:
                            if (h2 == 2) {
                                return false;
                            }
                            break;
                        case 8:
                            if (h2 == 3 || h2 == 1) {
                                return false;
                            }
                            break;
                        case 9:
                            if (h2 == 2 || h2 == 1) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                } else if (h2 != 1) {
                    return false;
                }
            } else if (h2 == 1) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x007a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x008c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x00c5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ff  */
    @Override // defpackage.agpy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(defpackage.agxw r8, defpackage.agpy r9) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agoi.d(agxw, agpy):boolean");
    }
}
