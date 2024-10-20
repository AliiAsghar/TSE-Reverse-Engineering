package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arjs {
    public int a;

    public arjs() {
    }

    public static arjs d(InputStream inputStream) {
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(inputStream, "utf-8");
            newPullParser.nextTag();
            arjs arjsVar = new arjs();
            if (newPullParser.getAttributeValue(null, "id") != null) {
                String attributeValue = newPullParser.getAttributeValue(null, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
                if ("urn:gsma:rcs:http-configuration:reconfigure".equalsIgnoreCase(attributeValue)) {
                    arjsVar.a = 1;
                } else if ("urn:gsma:rcs:extension:control".equalsIgnoreCase(attributeValue)) {
                    arjsVar.a = 2;
                    newPullParser.getAttributeValue(null, GroupManagementRequest.DATA_TAG);
                } else {
                    throw new IOException(a.cp(attributeValue, "Unexpected type: "));
                }
                return arjsVar;
            }
            throw new IllegalArgumentException("No id attribute found in XML document");
        } catch (XmlPullParserException e) {
            throw new IOException(e.getMessage());
        }
    }

    private static boolean i(char c) {
        if ("\\[]?*(|)^$.{}+".indexOf(c) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean a() {
        if (this.a > 0) {
            return true;
        }
        return false;
    }

    public final int b(alor alorVar, int i, int i2, apro aproVar) {
        aprq aprqVar;
        aprq aprqVar2;
        if (aproVar.c == 6) {
            aprqVar = (aprq) aproVar.d;
        } else {
            aprqVar = aprq.a;
        }
        if (aprqVar.g.size() != 0) {
            if (aproVar.c == 6) {
                aprqVar2 = (aprq) aproVar.d;
            } else {
                aprqVar2 = aprq.a;
            }
            Iterator<E> it = aprqVar2.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                aprp aprpVar = (aprp) it.next();
                Iterator<E> it2 = aprpVar.b.iterator();
                while (it2.hasNext()) {
                    if (((Integer) it2.next()).intValue() == i2) {
                        apqi apqiVar = aprpVar.c;
                        if (apqiVar == null) {
                            apqiVar = apqi.a;
                        }
                        int Z = a.Z(apqiVar.b);
                        if (Z == 0) {
                            Z = 1;
                        }
                        int i3 = Z - 2;
                        if (i3 != 2) {
                            if (i3 == 3) {
                                this.a = i + 1;
                            }
                        } else {
                            apqi apqiVar2 = aprpVar.c;
                            if (apqiVar2 == null) {
                                apqiVar2 = apqi.a;
                            }
                            if (alorVar.containsKey(apqiVar2.c)) {
                                apqi apqiVar3 = aprpVar.c;
                                if (apqiVar3 == null) {
                                    apqiVar3 = apqi.a;
                                }
                                this.a = ((Integer) alorVar.get(apqiVar3.c)).intValue();
                            }
                        }
                    }
                }
            }
        }
        return this.a;
    }

    public final boolean c(char[] cArr, StringBuilder sb, boolean z) {
        int length = cArr.length;
        loop0: while (true) {
            int i = this.a;
            if (i < length) {
                int i2 = i + 1;
                this.a = i2;
                char c = cArr[i];
                if (c != '*') {
                    if (c != ',') {
                        if (c != '?') {
                            if (c != '{') {
                                if (c != '}') {
                                    if (c != '[') {
                                        if (c != '\\') {
                                            if (i(c)) {
                                                sb.append('\\');
                                            }
                                            sb.append(c);
                                        } else {
                                            if (i2 == length) {
                                                return false;
                                            }
                                            this.a = i + 2;
                                            char c2 = cArr[i2];
                                            if (i(c2)) {
                                                sb.append('\\');
                                            }
                                            sb.append(c2);
                                        }
                                    } else {
                                        sb.append(c);
                                        int i3 = this.a;
                                        if (i3 == length) {
                                            break;
                                        }
                                        this.a = i3 + 1;
                                        char c3 = cArr[i3];
                                        if (c3 == '!') {
                                            sb.append('^');
                                            int i4 = this.a;
                                            if (i4 == length) {
                                                break;
                                            }
                                            this.a = i4 + 1;
                                            c3 = cArr[i4];
                                        }
                                        if (c3 == ']') {
                                            sb.append(']');
                                            int i5 = this.a;
                                            if (i5 != length) {
                                                this.a = i5 + 1;
                                                c3 = cArr[i5];
                                            } else {
                                                continue;
                                            }
                                        }
                                        while (c3 != ']') {
                                            sb.append(c3);
                                            int i6 = this.a;
                                            if (i6 == length) {
                                                break loop0;
                                            }
                                            this.a = i6 + 1;
                                            c3 = cArr[i6];
                                        }
                                        sb.append(']');
                                    }
                                } else {
                                    if (z) {
                                        sb.append(')');
                                        return true;
                                    }
                                    sb.append("\\}");
                                }
                            } else {
                                sb.append('(');
                                if (!c(cArr, sb, true)) {
                                    return false;
                                }
                            }
                        } else {
                            sb.append('.');
                        }
                    } else {
                        if (true == z) {
                            c = '|';
                        }
                        sb.append(c);
                    }
                } else {
                    sb.append(".*");
                }
            } else {
                if (i != length) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void e(boolean z) {
        this.a = (this.a * 31) + (z ? 1 : 0);
    }

    public final void f(Object obj) {
        int hashCode;
        int i = this.a * 31;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        this.a = i + hashCode;
    }

    public final void g(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = this.a; i > 0; i--) {
            sb.append(' ');
        }
        alvw g = uoo.a.g();
        g.X(alwp.a, "pwq_state");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueDebugger$1", "emitLine", 238, "WorkQueueDebugger.java")).D("%s%s", sb, str);
    }

    public final ucz h() {
        this.a += 3;
        return new ucz(this, 8);
    }

    public arjs(byte[] bArr) {
        this.a = -1;
    }

    public arjs(byte[] bArr, char[] cArr) {
        this.a = 1;
    }

    public arjs(char[] cArr, byte[] bArr) {
        this.a = 0;
    }
}
