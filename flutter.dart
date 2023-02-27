ElevatedButton(
                        onPressed: () async {
                          if (_formkey.currentState!.validate()) {
                            var headersList = {
                              'Content-Type': 'application/json'
                            };
                            var res = await http.post(
                              Uri.parse(
                                  "https://voting.padxu.com/auth/register"),
                              body: {
                                'email': emailController.text,
                                'password': passwordController.text,
                                'name': nameController.text,
                                'phone': numberController.text
                              },
                            );
                            if (res.statusCode >= 200 && res.statusCode < 300) {
                              // ignore: use_build_context_synchronously
                              ScaffoldMessenger.of(context).showSnackBar(
                                SnackBar(
                                  content: Text(
                                    "Registered Successfully",
                                  ),
                                  backgroundColor: Colors.green.shade300,
                                  behavior: SnackBarBehavior.floating,
                                  duration: const Duration(
                                    milliseconds: 2500,
                                  ),
                                  action: SnackBarAction(
                                    label: 'Dismiss',
                                    disabledTextColor: Color(0xFFFFFFFF),
                                    textColor: Color(0xFFFFFFFF),
                                    onPressed: () {
                                      ScaffoldMessenger.of(context)
                                          .removeCurrentSnackBar();
                                    },
                                  ),
                                ),
                              );
                              Navigator.of(context)
                                  .push(MaterialPageRoute(builder: ((context) {
                                return LoginPage();
                              })));
                            } else {
                              var decodedJSON = jsonDecode(res.body) as Map;
                              if (decodedJSON.containsKey("message")) {
                                ScaffoldMessenger.of(context).showSnackBar(
                                  SnackBar(
                                    content: Text(
                                      decodedJSON['message'],
                                    ),
                                    backgroundColor: Colors.green.shade300,
                                    behavior: SnackBarBehavior.floating,
                                    duration: const Duration(
                                      milliseconds: 2500,
                                    ),
                                    action: SnackBarAction(
                                      label: 'Dismiss',
                                      disabledTextColor: Color(0xFFFFFFFF),
                                      textColor: Color(0xFFFFFFFF),
                                      onPressed: () {
                                        ScaffoldMessenger.of(context)
                                            .removeCurrentSnackBar();
                                      },
                                    ),
                                  ),
                                );
                              }
                            }
                          }
                        },
                        style: ElevatedButton.styleFrom(
                          backgroundColor: Colors.deepPurple,
                          fixedSize: const Size(150, 55),
                          shape: RoundedRectangleBorder(
                              borderRadius: BorderRadius.circular(10)),
                        ),
                        child: const Text(
                          "Register",
                          style: TextStyle(
                              color: Colors.white,
                              fontWeight: FontWeight.bold,
                              fontSize: 18),
                        ),
                      ),
