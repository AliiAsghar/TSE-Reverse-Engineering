package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class atqm {
    private static final Pattern x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    private static final Pattern y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    final atqq a;
    final Method b;
    final Annotation[] c;
    final Annotation[][] d;
    final Type[] e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    String n;
    boolean o;
    boolean p;
    boolean q;
    String r;
    aslv s;
    aslz t;
    Set u;
    atqh[] v;
    boolean w;

    public atqm(atqq atqqVar, Method method) {
        this.a = atqqVar;
        this.b = method;
        this.c = method.getAnnotations();
        this.e = method.getGenericParameterTypes();
        this.d = method.getParameterAnnotations();
    }

    private static Class c(Class cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        return cls;
    }

    private final void d(int i, Type type) {
        if (!atqx.o(type)) {
        } else {
            throw atqx.d(this.b, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }

    private static /* synthetic */ String e(Class cls) {
        return cls.getSimpleName() + " must include generic type (e.g., " + cls.getSimpleName() + "<String>)";
    }

    public final atqh a(int i, Type type, Annotation[] annotationArr, boolean z) {
        atqh atqhVar;
        atqh atqhVar2;
        atqh atpsVar;
        atqh atpzVar;
        atqh atprVar;
        if (annotationArr != null) {
            atqhVar = null;
            for (Annotation annotation : annotationArr) {
                if (annotation instanceof atsc) {
                    d(i, type);
                    if (!this.m) {
                        if (!this.i) {
                            if (!this.j) {
                                if (!this.k) {
                                    if (!this.l) {
                                        if (this.r == null) {
                                            this.m = true;
                                            if (type != aslx.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                                throw atqx.d(this.b, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                            }
                                            atqhVar2 = new atqf(this.b, i);
                                        } else {
                                            throw atqx.d(this.b, i, "@Url cannot be used with @%s URL", this.n);
                                        }
                                    } else {
                                        throw atqx.d(this.b, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                } else {
                                    throw atqx.d(this.b, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                            } else {
                                throw atqx.d(this.b, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                            }
                        } else {
                            throw atqx.d(this.b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                        }
                    } else {
                        throw atqx.d(this.b, i, "Multiple @Url method annotations found.", new Object[0]);
                    }
                } else {
                    if (annotation instanceof atrw) {
                        d(i, type);
                        if (!this.j) {
                            if (!this.k) {
                                if (!this.l) {
                                    if (!this.m) {
                                        if (this.r != null) {
                                            this.i = true;
                                            atrw atrwVar = (atrw) annotation;
                                            String a = atrwVar.a();
                                            if (y.matcher(a).matches()) {
                                                if (this.u.contains(a)) {
                                                    this.a.b(type);
                                                    atpzVar = new atqa(this.b, i, a, atrwVar.b());
                                                } else {
                                                    throw atqx.d(this.b, i, "URL \"%s\" does not contain \"{%s}\".", this.r, a);
                                                }
                                            } else {
                                                throw atqx.d(this.b, i, "@Path parameter name must match %s. Found: %s", x.pattern(), a);
                                            }
                                        } else {
                                            throw atqx.d(this.b, i, "@Path can only be used with relative url on @%s", this.n);
                                        }
                                    } else {
                                        throw atqx.d(this.b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                } else {
                                    throw atqx.d(this.b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                }
                            } else {
                                throw atqx.d(this.b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                            }
                        } else {
                            throw atqx.d(this.b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                        }
                    } else if (annotation instanceof atrx) {
                        d(i, type);
                        atrx atrxVar = (atrx) annotation;
                        String a2 = atrxVar.a();
                        boolean b = atrxVar.b();
                        Class a3 = atqx.a(type);
                        this.j = true;
                        if (Iterable.class.isAssignableFrom(a3)) {
                            if (type instanceof ParameterizedType) {
                                this.a.b(atqx.h(0, (ParameterizedType) type));
                                atqhVar2 = new atpq(new atqb(a2, b));
                            } else {
                                throw atqx.d(this.b, i, e(a3), new Object[0]);
                            }
                        } else if (a3.isArray()) {
                            this.a.b(c(a3.getComponentType()));
                            atqhVar2 = new atpr(new atqb(a2, b));
                        } else {
                            this.a.b(type);
                            atpsVar = new atqb(a2, b);
                            atqhVar2 = atpsVar;
                        }
                    } else if (annotation instanceof atrz) {
                        d(i, type);
                        boolean a4 = ((atrz) annotation).a();
                        Class a5 = atqx.a(type);
                        this.k = true;
                        if (Iterable.class.isAssignableFrom(a5)) {
                            if (type instanceof ParameterizedType) {
                                this.a.b(atqx.h(0, (ParameterizedType) type));
                                atprVar = new atpq(new atqd(a4));
                            } else {
                                throw atqx.d(this.b, i, e(a5), new Object[0]);
                            }
                        } else if (a5.isArray()) {
                            this.a.b(c(a5.getComponentType()));
                            atprVar = new atpr(new atqd(a4));
                        } else {
                            this.a.b(type);
                            atqhVar2 = new atqd(a4);
                        }
                        atqhVar2 = atprVar;
                    } else if (annotation instanceof atry) {
                        d(i, type);
                        Class a6 = atqx.a(type);
                        this.l = true;
                        if (Map.class.isAssignableFrom(a6)) {
                            Type i2 = atqx.i(type, a6, Map.class);
                            if (i2 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType = (ParameterizedType) i2;
                                Type h = atqx.h(0, parameterizedType);
                                if (h == String.class) {
                                    atpzVar = new atqc(this.b, i, this.a.b(atqx.h(1, parameterizedType)), ((atry) annotation).a());
                                } else {
                                    throw atqx.d(this.b, i, "@QueryMap keys must be of type String: ".concat(String.valueOf(String.valueOf(h))), new Object[0]);
                                }
                            } else {
                                throw atqx.d(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                            }
                        } else {
                            throw atqx.d(this.b, i, "@QueryMap parameter type must be Map.", new Object[0]);
                        }
                    } else if (annotation instanceof atrm) {
                        d(i, type);
                        String a7 = ((atrm) annotation).a();
                        Class a8 = atqx.a(type);
                        if (Iterable.class.isAssignableFrom(a8)) {
                            if (type instanceof ParameterizedType) {
                                this.a.b(atqx.h(0, (ParameterizedType) type));
                                atprVar = new atpq(new atpv(a7));
                            } else {
                                throw atqx.d(this.b, i, e(a8), new Object[0]);
                            }
                        } else if (a8.isArray()) {
                            this.a.b(c(a8.getComponentType()));
                            atprVar = new atpr(new atpv(a7));
                        } else {
                            this.a.b(type);
                            atqhVar2 = new atpv(a7);
                        }
                        atqhVar2 = atprVar;
                    } else if (annotation instanceof atrn) {
                        if (type == aslv.class) {
                            atqhVar2 = new atpx(this.b, i);
                        } else {
                            d(i, type);
                            Class a9 = atqx.a(type);
                            if (Map.class.isAssignableFrom(a9)) {
                                Type i3 = atqx.i(type, a9, Map.class);
                                if (i3 instanceof ParameterizedType) {
                                    ParameterizedType parameterizedType2 = (ParameterizedType) i3;
                                    Type h2 = atqx.h(0, parameterizedType2);
                                    if (h2 == String.class) {
                                        this.a.b(atqx.h(1, parameterizedType2));
                                        atqhVar2 = new atpw(this.b, i);
                                    } else {
                                        throw atqx.d(this.b, i, "@HeaderMap keys must be of type String: ".concat(String.valueOf(String.valueOf(h2))), new Object[0]);
                                    }
                                } else {
                                    throw atqx.d(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                }
                            } else {
                                throw atqx.d(this.b, i, "@HeaderMap parameter type must be Map.", new Object[0]);
                            }
                        }
                    } else if (annotation instanceof atrg) {
                        d(i, type);
                        if (this.p) {
                            atrg atrgVar = (atrg) annotation;
                            String a10 = atrgVar.a();
                            boolean b2 = atrgVar.b();
                            this.f = true;
                            Class a11 = atqx.a(type);
                            if (Iterable.class.isAssignableFrom(a11)) {
                                if (type instanceof ParameterizedType) {
                                    this.a.b(atqx.h(0, (ParameterizedType) type));
                                    atqhVar2 = new atpq(new atpt(a10, b2));
                                } else {
                                    throw atqx.d(this.b, i, e(a11), new Object[0]);
                                }
                            } else if (a11.isArray()) {
                                this.a.b(c(a11.getComponentType()));
                                atqhVar2 = new atpr(new atpt(a10, b2));
                            } else {
                                this.a.b(type);
                                atpsVar = new atpt(a10, b2);
                                atqhVar2 = atpsVar;
                            }
                        } else {
                            throw atqx.d(this.b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                        }
                    } else if (annotation instanceof atrh) {
                        d(i, type);
                        if (this.p) {
                            Class a12 = atqx.a(type);
                            if (Map.class.isAssignableFrom(a12)) {
                                Type i4 = atqx.i(type, a12, Map.class);
                                if (i4 instanceof ParameterizedType) {
                                    ParameterizedType parameterizedType3 = (ParameterizedType) i4;
                                    Type h3 = atqx.h(0, parameterizedType3);
                                    if (h3 == String.class) {
                                        atox b3 = this.a.b(atqx.h(1, parameterizedType3));
                                        this.f = true;
                                        atpzVar = new atpu(this.b, i, b3, ((atrh) annotation).a());
                                    } else {
                                        throw atqx.d(this.b, i, "@FieldMap keys must be of type String: ".concat(String.valueOf(String.valueOf(h3))), new Object[0]);
                                    }
                                } else {
                                    throw atqx.d(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                }
                            } else {
                                throw atqx.d(this.b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                            }
                        } else {
                            throw atqx.d(this.b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                        }
                    } else if (annotation instanceof atru) {
                        d(i, type);
                        if (this.q) {
                            atru atruVar = (atru) annotation;
                            this.g = true;
                            String b4 = atruVar.b();
                            Class a13 = atqx.a(type);
                            if (b4.isEmpty()) {
                                if (Iterable.class.isAssignableFrom(a13)) {
                                    if (type instanceof ParameterizedType) {
                                        if (asmb.class.isAssignableFrom(atqx.a(atqx.h(0, (ParameterizedType) type)))) {
                                            atqhVar2 = new atpq(atqe.a);
                                        } else {
                                            throw atqx.d(this.b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                        }
                                    } else {
                                        throw atqx.d(this.b, i, e(a13), new Object[0]);
                                    }
                                } else if (a13.isArray()) {
                                    if (asmb.class.isAssignableFrom(a13.getComponentType())) {
                                        atqhVar2 = new atpr(atqe.a);
                                    } else {
                                        throw atqx.d(this.b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                    }
                                } else if (asmb.class.isAssignableFrom(a13)) {
                                    atqhVar2 = atqe.a;
                                } else {
                                    throw atqx.d(this.b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                }
                            } else {
                                aslv au = aotl.au(assi.c, a.bW(b4, "form-data; name=\"", "\""), assi.b, atruVar.a());
                                if (Iterable.class.isAssignableFrom(a13)) {
                                    if (type instanceof ParameterizedType) {
                                        Type h4 = atqx.h(0, (ParameterizedType) type);
                                        if (!asmb.class.isAssignableFrom(atqx.a(h4))) {
                                            atqhVar2 = new atpq(new atpy(this.b, i, au, this.a.c(h4, this.c)));
                                        } else {
                                            throw atqx.d(this.b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                        }
                                    } else {
                                        throw atqx.d(this.b, i, e(a13), new Object[0]);
                                    }
                                } else if (a13.isArray()) {
                                    Class c = c(a13.getComponentType());
                                    if (!asmb.class.isAssignableFrom(c)) {
                                        atqhVar2 = new atpr(new atpy(this.b, i, au, this.a.c(c, this.c)));
                                    } else {
                                        throw atqx.d(this.b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                    }
                                } else if (!asmb.class.isAssignableFrom(a13)) {
                                    atpzVar = new atpy(this.b, i, au, this.a.c(type, this.c));
                                } else {
                                    throw atqx.d(this.b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                }
                            }
                        } else {
                            throw atqx.d(this.b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                        }
                    } else if (annotation instanceof atrv) {
                        d(i, type);
                        if (this.q) {
                            this.g = true;
                            Class a14 = atqx.a(type);
                            if (Map.class.isAssignableFrom(a14)) {
                                Type i5 = atqx.i(type, a14, Map.class);
                                if (i5 instanceof ParameterizedType) {
                                    ParameterizedType parameterizedType4 = (ParameterizedType) i5;
                                    Type h5 = atqx.h(0, parameterizedType4);
                                    if (h5 == String.class) {
                                        Type h6 = atqx.h(1, parameterizedType4);
                                        if (!asmb.class.isAssignableFrom(atqx.a(h6))) {
                                            atpzVar = new atpz(this.b, i, this.a.c(h6, this.c), ((atrv) annotation).a());
                                        } else {
                                            throw atqx.d(this.b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                        }
                                    } else {
                                        throw atqx.d(this.b, i, "@PartMap keys must be of type String: ".concat(String.valueOf(String.valueOf(h5))), new Object[0]);
                                    }
                                } else {
                                    throw atqx.d(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                }
                            } else {
                                throw atqx.d(this.b, i, "@PartMap parameter type must be Map.", new Object[0]);
                            }
                        } else {
                            throw atqx.d(this.b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                        }
                    } else if (annotation instanceof atre) {
                        d(i, type);
                        if (!this.p && !this.q) {
                            if (!this.h) {
                                try {
                                    atox c2 = this.a.c(type, this.c);
                                    this.h = true;
                                    atpsVar = new atps(this.b, i, c2);
                                    atqhVar2 = atpsVar;
                                } catch (RuntimeException e) {
                                    throw atqx.e(this.b, e, i, "Unable to create @Body converter for %s", type);
                                }
                            } else {
                                throw atqx.d(this.b, i, "Multiple @Body method annotations found.", new Object[0]);
                            }
                        } else {
                            throw atqx.d(this.b, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                        }
                    } else if (annotation instanceof atsb) {
                        d(i, type);
                        Class a15 = atqx.a(type);
                        for (int i6 = i - 1; i6 >= 0; i6--) {
                            atqh atqhVar3 = this.v[i6];
                            if ((atqhVar3 instanceof atqg) && ((atqg) atqhVar3).a.equals(a15)) {
                                throw atqx.d(this.b, i, "@Tag type " + a15.getName() + " is duplicate of parameter #" + (i6 + 1) + " and would always overwrite its value.", new Object[0]);
                            }
                        }
                        atqhVar2 = new atqg(a15);
                    } else {
                        atqhVar2 = null;
                    }
                    atqhVar2 = atpzVar;
                }
                if (atqhVar2 != null) {
                    if (atqhVar == null) {
                        atqhVar = atqhVar2;
                    } else {
                        throw atqx.d(this.b, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                }
            }
        } else {
            atqhVar = null;
        }
        if (atqhVar == null) {
            if (z) {
                try {
                    if (atqx.a(type) == arpe.class) {
                        this.w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw atqx.d(this.b, i, "No Retrofit annotation found.", new Object[0]);
        }
        return atqhVar;
    }

    public final void b(String str, String str2, boolean z) {
        String str3 = this.n;
        if (str3 == null) {
            this.n = str;
            this.o = z;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (x.matcher(substring).find()) {
                    throw atqx.b(this.b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.r = str2;
            Matcher matcher = x.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.u = linkedHashSet;
            return;
        }
        throw atqx.b(this.b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
    }
}
