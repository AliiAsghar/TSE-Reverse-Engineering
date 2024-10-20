package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afen implements Serializable, afel {
    private static final long serialVersionUID = -8713434243256937394L;
    private final String a;

    public afen(String str) {
        this.a = str;
    }

    @Override // defpackage.afel
    public final int a() {
        return 1;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return afel.class;
    }

    @Override // defpackage.afel
    public final String b() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afel) {
            afel afelVar = (afel) obj;
            if (this.a.equals(afelVar.b()) && afelVar.a() == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a.hashCode() ^ 428460789) + 1704546089;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        StringBuilder sb = new StringBuilder("@com.google.android.libraries.compose.attachments.serialization.annotations.AttachmentDeserializerKey(");
        sb.append("name=\"");
        int i = 0;
        while (true) {
            String str = this.a;
            if (i < str.length()) {
                char charAt = str.charAt(i);
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
                i++;
            } else {
                sb.append("\", version=1)");
                return sb.toString();
            }
        }
    }
}
