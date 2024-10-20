package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abhn;
import defpackage.abuz;
import defpackage.abvi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class FastJsonResponse {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final abuz CREATOR = new abuz(0);
        public final int a;
        protected final int b;
        protected final boolean c;
        protected final int d;
        protected final boolean e;
        protected final String f;
        public final int g;
        protected final Class h;
        protected final String i;
        public FieldMappingDictionary j;
        public StringToIntConverter k;

        public Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, ConverterWrapper converterWrapper) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = i3;
            this.e = z2;
            this.f = str;
            this.g = i4;
            StringToIntConverter stringToIntConverter = null;
            if (str2 == null) {
                this.h = null;
                this.i = null;
            } else {
                this.h = SafeParcelResponse.class;
                this.i = str2;
            }
            if (converterWrapper != null && (stringToIntConverter = converterWrapper.b) == null) {
                throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
            }
            this.k = stringToIntConverter;
        }

        final String a() {
            String str = this.i;
            if (str == null) {
                return null;
            }
            return str;
        }

        public final Map b() {
            abhg.m(this.i);
            abhg.m(this.j);
            Map a = this.j.a(this.i);
            abhg.m(a);
            return a;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            abhg.q("versionCode", Integer.valueOf(this.a), arrayList);
            abhg.q("typeIn", Integer.valueOf(this.b), arrayList);
            abhg.q("typeInArray", Boolean.valueOf(this.c), arrayList);
            abhg.q("typeOut", Integer.valueOf(this.d), arrayList);
            abhg.q("typeOutArray", Boolean.valueOf(this.e), arrayList);
            abhg.q("outputFieldName", this.f, arrayList);
            abhg.q("safeParcelFieldId", Integer.valueOf(this.g), arrayList);
            abhg.q("concreteTypeName", a(), arrayList);
            Class cls = this.h;
            if (cls != null) {
                abhg.q("concreteType.class", cls.getCanonicalName(), arrayList);
            }
            StringToIntConverter stringToIntConverter = this.k;
            if (stringToIntConverter != null) {
                abhg.q("converterName", stringToIntConverter.getClass().getCanonicalName(), arrayList);
            }
            return abhg.p(arrayList, this);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            ConverterWrapper converterWrapper;
            int i2 = this.a;
            int e = abhi.e(parcel);
            abhi.m(parcel, 1, i2);
            abhi.m(parcel, 2, this.b);
            abhi.h(parcel, 3, this.c);
            abhi.m(parcel, 4, this.d);
            abhi.h(parcel, 5, this.e);
            abhi.q(parcel, 6, this.f, false);
            abhi.m(parcel, 7, this.g);
            abhi.q(parcel, 8, a(), false);
            StringToIntConverter stringToIntConverter = this.k;
            if (stringToIntConverter == null) {
                converterWrapper = null;
            } else {
                converterWrapper = new ConverterWrapper(stringToIntConverter);
            }
            abhi.o(parcel, 9, converterWrapper, i, false);
            abhi.g(parcel, e);
        }

        public Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls) {
            this.a = 1;
            this.b = i;
            this.c = z;
            this.d = i2;
            this.e = z2;
            this.f = str;
            this.g = i3;
            this.h = cls;
            if (cls == null) {
                this.i = null;
            } else {
                this.i = cls.getCanonicalName();
            }
            this.k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final Object d(Field field, Object obj) {
        StringToIntConverter stringToIntConverter = field.k;
        if (stringToIntConverter != null) {
            obj = (String) stringToIntConverter.c.get(((Integer) obj).intValue());
            if (obj == null && stringToIntConverter.b.containsKey("gms_unknown")) {
                return "gms_unknown";
            }
        }
        return obj;
    }

    private static final void g(StringBuilder sb, Field field, Object obj) {
        int i = field.b;
        if (i != 11) {
            if (i == 7) {
                sb.append("\"");
                sb.append(abvi.a((String) obj));
                sb.append("\"");
                return;
            }
            sb.append(obj);
            return;
        }
        Class cls = field.h;
        abhg.m(cls);
        sb.append(((FastJsonResponse) cls.cast(obj)).toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object a(Field field) {
        String str = field.f;
        if (field.h != null) {
            e();
            abhg.j(true, "Concrete field shouldn't be value object: %s", field.f);
            boolean z = field.e;
            try {
                return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), null).invoke(this, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        e();
        return null;
    }

    public abstract Map b();

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean c(Field field) {
        if (field.d == 11) {
            boolean z = field.e;
            String str = field.f;
            if (z) {
                throw new UnsupportedOperationException("Concrete type arrays not supported");
            }
            throw new UnsupportedOperationException("Concrete types not supported");
        }
        String str2 = field.f;
        f();
        return false;
    }

    protected abstract void e();

    protected abstract void f();

    public String toString() {
        Map b = b();
        StringBuilder sb = new StringBuilder(100);
        for (String str : b.keySet()) {
            Field field = (Field) b.get(str);
            if (c(field)) {
                Object d = d(field, a(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (d == null) {
                    sb.append("null");
                } else {
                    switch (field.d) {
                        case 8:
                            sb.append("\"");
                            sb.append(abhn.e((byte[]) d));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(abhn.f((byte[]) d));
                            sb.append("\"");
                            break;
                        case 10:
                            abhn.b(sb, (HashMap) d);
                            break;
                        default:
                            if (field.c) {
                                ArrayList arrayList = (ArrayList) d;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        g(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            } else {
                                g(sb, field, d);
                                break;
                            }
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
