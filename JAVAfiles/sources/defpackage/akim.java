package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akim implements Serializable, akjc {
    private static final long serialVersionUID = -4770846455854161599L;
    private final String a = "com.google.android.apps.messaging.auto";

    @Override // defpackage.akjc
    public final String a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return akjc.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akjc) {
            return this.a.equals(((akjc) obj).a());
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return this.a.hashCode() ^ 1335633679;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        StringBuilder sb = new StringBuilder("@com.google.apps.tiktok.experiments.phenotype.PhenotypeApplicationSpecificProperties(");
        sb.append('\"');
        for (int i = 0; i < 38; i++) {
            char charAt = "com.google.android.apps.messaging.auto".charAt(i);
            if (charAt != '\t') {
                if (charAt != '\n') {
                    if (charAt != '\r') {
                        if (charAt != '\"' && charAt != '\'' && charAt != '\\') {
                            if (charAt < ' ') {
                                sb.append('\\');
                                aetn.aY(sb, Integer.toOctalString(charAt), 3);
                            } else if (charAt >= 127 && !Character.isLetter(charAt)) {
                                sb.append("\\u");
                                aetn.aY(sb, Integer.toHexString(charAt), 4);
                            } else {
                                sb.append(charAt);
                            }
                        } else {
                            sb.append('\\');
                            sb.append(charAt);
                        }
                    } else {
                        sb.append("\\r");
                    }
                } else {
                    sb.append("\\n");
                }
            } else {
                sb.append("\\t");
            }
        }
        sb.append("\")");
        return sb.toString();
    }
}
